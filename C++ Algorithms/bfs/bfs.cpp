#include<iostream>
#include<queue>
#include<cstring>
#include<fstream>

using namespace std;

int R, C; // num of row and col
char maps[201][201]; // map
int visited[201][201];

int bfs(int rowS, int colS)
{
	memset(visited, 0, sizeof(visited));
	
	queue < pair<int,int> > Q;
	
	Q.push(make_pair(rowS, colS));
	
	
	for(int moves = 0; Q.size() > 0; moves++)
	{
		int currentQueueSize = Q.size();
		for(int aaa = 0; aaa < currentQueueSize; aaa++)
		{
			pair<int,int> currentNode = Q.front();
			Q.pop();
			int curRow = currentNode.first;
			int curCol = currentNode.second;
			
			if(visited[curRow][curCol])
			{
				continue;
			}
			visited[curRow][curCol] = 1;
			
			if(maps[curRow][curCol] == 'F')
			{
				return moves;
			}
			
			if(curRow - 1 >= 0 && !visited[curRow-1][curCol])
			{
				Q.push(make_pair(curRow-1, curCol));
			}
			if(curRow + 1 < R && !visited[curRow+1][curCol])
			{
				Q.push(make_pair(curRow+1, curCol));
			}
			
			if(curCol - 1 >= 0 && !visited[curRow][curCol-1])
			{
				Q.push(make_pair(curRow, curCol-1));
			}
			if(curCol + 1 < C && !visited[curRow][curCol+1])
			{
				Q.push(make_pair(curRow, curCol+1));
			}
		}
	}
	
	return -1;
}

int main()
{
    int res;
	string line;

	ifstream inputFile ("input.txt");
	if (inputFile.is_open()) {
		int lineNum = 0;
		inputFile >> R;
		inputFile >> C;
		while (getline(inputFile, line)) {
			if (line.size() == 0) {
				continue;
			}
			strcpy(maps[lineNum], line.c_str());
			lineNum++;
		}
	}

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            if(maps[i][j] == 'S')
                res = bfs(i, j);
        }
    }

  cout << res << " move(s)" << endl;

	return 0;
}