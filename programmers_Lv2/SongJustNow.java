package programmers_Lv2;

//import java.util.ArrayList;
//import java.util.List;

public class SongJustNow {

	public static void main(String[] args) {
		String m = "CC#BCC#BCC#BCC#B";
		String[] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
//		String m = "ABCDEFG";
//		String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		String answer = "";
		String[] str = {};
		int hour = 0;
		int minute = 0;
		int time = 0;
		int longerTime = 0;
//		int length = 0;
		StringBuilder sb = new StringBuilder();
//		List<String> list = new ArrayList<String>();
		
//		for (String mi : musicinfos) {
//			str = mi.split(",");
//			hour = Integer.parseInt(str[1].substring(0, 2)) - Integer.parseInt(str[0].substring(0, 2));
//			minute = Integer.parseInt(str[1].substring(3)) - Integer.parseInt(str[0].substring(3));
//
//			if (minute<0) {
//				minute += 60;
//				hour--;
//			}
//
//			time = hour * 60 + minute;
//
//			for(int i=0; i<str[3].length(); i++) {
//				list.add(str[3].substring(i, i<str[3].length()-1 && str[3].charAt(i+1)=='#' ? i+++2 : i+1));
//			}
//			
//			length = list.size();
//			
//			for(int i=0; i<time; i++) {
//				sb.append(list.get(i%length));
//			}
//			
//			if(sb.toString().replace(m + "#", "").contains(m) && longerTime<time) {
//				answer = str[2];
//				longerTime = time;
//			}
//			
//			sb.setLength(0);
//			list.clear();
//		}

		
		for (String mi : musicinfos) {
			str = mi.split(",");
			hour = Integer.parseInt(str[1].substring(0, 2)) - Integer.parseInt(str[0].substring(0, 2));
			minute = Integer.parseInt(str[1].substring(3)) - Integer.parseInt(str[0].substring(3));

			if (minute<0) {
				minute += 60;
				hour--;
			}

			time = hour * 60 + minute;

			str[3] = str[3].replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a");
			m = m.replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a");
			
			for(int i=0; i<time/str[3].length(); i++) {
				sb.append(str[3]);
			}
			
			sb.append(str[3].substring(0, time%str[3].length()));
			
			if(sb.toString().contains(m) && longerTime<time) {
				answer = str[2];
				longerTime = time;
			}
			
			sb.setLength(0);
		}
		
		System.out.println(!"".equals(answer) ? answer : "(None)");
	}

}
