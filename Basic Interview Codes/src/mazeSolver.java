import java.util.*;

public class mazeSolver {
    static int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}}; // Up, Right, Down, Left

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input: dimensions of the maze
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine(); // Move to the next line
        
        // Creating the maze
        char[][] maze = new char[rows][cols];
        
        // Reading the maze layout
        for (int i = 0; i < rows; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < cols; j++) {
                maze[i][j] = line.charAt(j);
            }
        }
        
        // Finding the start position
        int startX = -1, startY = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j] == '#') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }
        
        // Navigating the maze
        int hops = navigateMaze(maze, startX, startY);
        System.out.println(hops);
        
        scanner.close();
    }
    
    // Function to navigate the maze using BFS
    public static int navigateMaze(char[][] maze, int startX, int startY) {
        int rows = maze.length;
        int cols = maze[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        
        queue.offer(new int[]{startX, startY, 0}); // Adding starting position to the queue
        visited[startX][startY] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int hops = current[2];
            
            // Check if reached the end point
            if (maze[x][y] == '@') {
                return hops;
            }
            
            // Explore neighboring cells
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                
                // Check if the new position is within bounds and not visited
                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && maze[newX][newY] != '0' && !visited[newX][newY]) {
                    queue.offer(new int[]{newX, newY, hops + 1});
                    visited[newX][newY] = true;
                }
            }
        }
        
        // If end point is not reachable
        return -1;
    }
}