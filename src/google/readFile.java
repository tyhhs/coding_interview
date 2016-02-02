package google;

import java.util.ArrayList;
import java.util.List;

public class readFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "dir1\r\n dir11\r\n dir12\r\n  picture.jpeg\r\n  dir121\r\n  file1.txtdir2\r\n file2.gif";
		System.out.println(new readFile().solution(S));
	}

    public int solution(String S) {
        // write your code in Java
    	int maxLength = 0;
    	int[] levels = new int[10];
    	//store the file system contents into a string array
    	String[] lines = S.split("\r\n");
    	for(String line : lines){
    		int level = countBlank(line);
    		if(isImage(line)){
    			int length = line.trim().length() + 1;
    			for(int i = 0; i < level; i++){
    				length += levels[i];
    			}
    			maxLength = Math.max(length , maxLength);
    		}
    		else{//derectory
    			levels[level] = line.trim().length() + 1;
    		}
    	}
    	return maxLength;    	
    }
    
    public int countBlank(String line){
    	for(int i = 0; i < line.length(); i++){
    		if(line.charAt(i) != ' '){
    			return i;
    		}
    	}
    	return -1;
    }
    public boolean isImage(String line){
    	String[] parts = line.split("\\.");
    	if(parts.length == 2){
    		if(parts[1].equals("jpeg") || parts[1].equals("png") || parts[1].equals("gif")){
    			return true;
    		}
    	}
    	return false;
    }
}
