package algorithm.search;


/**
 * DFS ( Depth First Search) : 깊이 우선 탐색 깊이 우선 탐색(DFS)는 루트 노드나 임의의 노드에서 시작하여 최대한
 * 깊숙히 들어가서 탐색한 후 다시 원점으로 돌아가 다른 루트로 탐색하는 방식이다. 다음 노드로 넘어가기 전에 해당 노드의 분기에 대해 완전
 * 탐색을 하는 방식이다.
 * 
 * 일반적으로 재귀호출을 사용하여 구현하지만 단순한 탐색이나 인접 행렬, 인접 리스트를 이용해 구현하기도 한다.
 * 
 * DFS의 기본적인 순서는 다음과 같다
 *  1. 현재 정점과 인접한 간선들을 하나씩 검사한다.
 *  2. 아직 방문하지 않은 정점으로 향하는 간선이 있다면 따라가고,
 *  3. 더이상 갈 곳이 없다면 포기하고 마지막에 온 간선을 따라 뒤로 돌아간다.
 * 
 * DFS의 장점은 구현이 너비 우선 탐색(BFS)보다 간단하다. 또한 현재 경로상의 노드들만 기억하면 되므로, 저장 공간의 수요가 비교적
 * 적다.
 * 
 * 단점으로는 모든 정점, 간선을 탐색하므로 검색 속도는 너비 우선 탐색보다 느리다. 해가 없는 경우에 빠질 수 있다. 깊이 우선 탐색은 해를
 * 구하면 탐색이 종료되므로, 구한 해가 최단 경로가 된다는 보장이 없다. 즉, 목표에 이르는 경로가 다수인 경우 구한 해가 최적이 아닐 수도
 * 있다.
 * 
 * DFS의 시간 복잡도는 인접 리스트를 이용했을 때 모든 정점을 한번씩 간선을 1번 확인하므로 O(|V| + |E|) 이다. 인접 행렬을
 * 사용한다면 DFS내부에서 다른 모든 정점들을 순회하며 간선을 확인 하므로 O(|V|^2)이다.
 * 
 */
public class DepthFirstSearch {

	// 각 노드가 방분된 정보를 배열로 표현
	public static boolean[] visited = { false, false, false, false, false, false, false, false, false };

	// 각 노드가 연결된 정보를 2차원 배열로 포현
	public static int[][] graph = { {},
			{2, 3, 8},
	        {1, 7},
	        {1, 4, 5},
	        {3, 5},
	        {3, 4},
	        {7},
	        {2, 6, 8},
	        {1, 7}
		};
	
	public static void main(String[] args) {
		
		int start = 1;
		
		dfs(start);

	} // main
	
	/**
	 * DFS 알고리즘 수행 함수
	 * @param v 탐색할 노드
	 */
	public static void dfs(int v) {
		// 현재 노드 방문 처리
		visited[v] = true;
		// 방문한 노드 출력
		System.out.print(v + " ");
		
		// 인접 노드 탐색
		for( int i : graph[v]) {
			// 방문하지 않은 인접 노드 중 가장 작은 노드를 스택에 넣는다.
			if( visited[i] == false ) {
				dfs(i);
			} // end if
		} // end for
		
	} // dfs

} // class
