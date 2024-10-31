package programmers_Lv2;

public class NQueen {
	private static int answer = 0;
	
	public static void main(String[] args) {
		int n = 4;
		int[] arr = new int[n];
		
		bt(n, 0, arr);
		
		System.out.println(answer);
	}
	
	
	private static void bt(int n, int index, int[] arr) {
		if(index==n) {
			answer++;
		} else {
			l : for(int i=0; i<n; i++) {
                arr[index] = i;
                
                for(int j=0; j<index; j++) {
                    if(arr[j]==arr[index] || Math.abs(arr[j]-arr[index])==Math.abs(j-index)) {
                        continue l;
                    }
                }

                bt(n, index+1, arr);
            }
		}
	}
	
//dfs로 한 결과 시간 초과. 이런 경우 백트래킹이 더 효율적	
//	private static int[] arr = {};
//	private static int answer = 0;
//
//	public static void main(String[] args) {
//		int n = 4;
//		arr = new int[n];
//		
//		for(int i=0; i<n; i++) {
//        	arr[i] = i;
//        }
//        
//        dfs(arr, 0, n);
//        
//        System.out.println(answer);
//	}
//
//	private static void dfs(int[] arr, int depth, int n) {
//		if(depth==n) {
//			for(int i=0; i<n-1; i++) {
//				for(int j=i+1; j<n; j++) {
//					if(Math.abs(arr[i]-arr[j])==Math.abs(i-j)) {
//						return;
//					}
//				}
//			}
//			
//			answer++;
//			return;
//		}
//
//		for(int i = depth; i<n; i++) {
//			swap(arr, i, depth);
//			dfs(arr, depth + 1, n);
//            swap(arr, i, depth);
//        }
//	}
//	
//	private static void swap(int[] arr, int i, int j) {
//		int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//	}
}
