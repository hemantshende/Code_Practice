public class RaeesCDAC {
    public int solution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int ans = 0;
        int i=0,j=0;
        
        for( i=0; i<n; i++) {
        	for( j=0; j<m; j++) {
        		if(arr[i][j]=='#') {
        			System.out.println(i+" "+j);
        			arr[i][j]=2;
        			break;
        		}
        	}
        }
        
        System.out.println(ans);

        while ( i< n || i>=0 || j<m || j>=0) {
        	System.out.println("inside while");
        	
        	if(i+1<n){
        		if(arr[i+1][j]==1) {
        			ans++;
            		arr[i][j]=2;
            		i++;
            		System.out.println(ans);
        		}	
        	}
        	if(j+1<m){
        		if(arr[i][j+1]==1) {
        			ans++;
            		arr[i][j]=2;
            		j++;
            		System.out.println(ans);
        		}	
        	}
        	if(i-1>=0){
        		if(arr[i-1][j]==1) {
        			ans++;
            		arr[i][j]=2;
            		i--;
            		System.out.println(ans);
        		}	
        	} 
        	if(j-1>=0){
        		if(arr[i][j-1]==1) {
        			ans++;
            		arr[i][j]=2;
            		j--;
            		System.out.println(ans);
        		}	
        	}
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        RaeesCDAC raees = new RaeesCDAC();
        int[][] maze = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 1, '@', 0, 0},
            {0, '#', 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        int hops = raees.solution(maze);
        System.out.println("Number of hops required: " + hops);
    }
}
