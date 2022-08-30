package hackerrank;

public class Robot {
	public boolean isRobotBounded(String instructions) {
		
//		initialize position
		int[] pos =  new int[] {0, 0};
		
//		directions North, East, South and West
		int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		
		int face = 0;
		char[] ins = instructions.toCharArray();
		
		for(char c: ins) {
			if(c == 'L') {
				face = face == 0 ? 3 : face - 1;
			}
			else if(c == 'R') {
				face = face == 3 ? 0: face + 1;
			}
			else {
				pos[0] = pos[0] + dirs[face][0];
				pos[1] = pos[1] + dirs[face][1];
			}
		}
		return (face != 0 || (pos[0] == 0 && pos[1] == 0));
	}

}
