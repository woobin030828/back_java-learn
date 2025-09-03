package collectionTest.arrayList2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeMessage.RecipientType;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	public static User loginUser = null;
	public String code;
	
//	아이디검사
	public User checkId(String id) {
		for(User user: users) {
			if(!user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	
//	회원가입
	public void join(User user) {
		User userInDb = checkId(user.getId());
		
		if(userInDb == null) {
			users.add(user);
		}
	}
//	로그인
	public boolean login(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb == null) {
			System.out.println("아이디가 일치하지 않습니다.");
			loginUser = userInDb;
			return false;
		} else {
			if(userInDb.getPassword().equals(user.getPassword())) {
				System.out.printf("로그인 성공, 환영합니다 %s 님", userInDb.getName());
				loginUser = userInDb;
				return true;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				loginUser = null;
				return false;
			}
		}
	}

	
//	로그아웃
	public void logout() {
		loginUser = null;
	}
//	암호화
	public String passwordEncryption(String str){
		String encryptionPassword = "";
		if(str != null) {
			for(char c: str.toCharArray()) {
				encryptionPassword += (char)(c + '!' + (Math.random() * 10) * (Math.random() * 10));
			}
			return encryptionPassword;
		} else {
			return null;
		}
	}
//	비밀번호 변경(마이페이지)
	
	public void update(User user) {
		User userInDb = checkId(user.getId());
		if (userInDb != null) {
			userInDb.setPassword(passwordEncryption(user.getPassword()));
		}

	}
	
//	비밀번호 변경(비밀번호 변경 30일)
	public void changePasswordOneMouth(String password, String newPassword) {
		User userInDb = checkId(loginUser.getId());
		if (userInDb != null) {
			userInDb.setPassword(passwordEncryption(newPassword));
		}
		
	}
	
	
//	인증번호 생성
	public void randomNumber() {
		String result = "";
		for(int i = 0; i < 6; i++) {
			result += (int)(Math.random() * 10);
		}
		code = result;
	}
//	인증번호 전송
	public void sendEmail(String eMail) {
		// 메일 인코딩
        final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
        
        //원하는 메일 제목 작성
        String subject = "[BlueCotton] 인증메일입니다.";
        
        //보낸 이메일 작성
        String fromEmail = "wbu3us2@gmail.com";
        String fromUsername = "최우빈";
        
        String toEmail = eMail; // 콤마(,)로 여러개 나열
        
        //도메인 사용할 필요 없다
        //앱비밀번호
        final String username = "wbu3us2@gmail.com";         
        final String password = "ecns ddnk nbas nvfz";
        
        this.randomNumber();
        
        // 메일에 출력할 텍스트
        String html = null;
        StringBuffer sb = new StringBuffer();
        sb.append("<h3>인증 번호를 발송드립니다.</h3>\n");
        sb.append("<h3>인증 번호는 " + code + " 입니다.</h3>");
        sb.append("<h3>감사합니다.</h3>\n");
        sb.append("<h4>최우빈 드림.</h4>\n");    
        html = sb.toString();
        
        // 메일 옵션 설정
        Properties props = new Properties();    
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        try {
          // 메일 서버  인증 계정 설정
          Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
            }
          };
          
          // 메일 세션 생성
          Session session = Session.getDefaultInstance(props, auth);
          
          // 메일 송/수신 옵션 설정
          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail, fromUsername));
          message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
          message.setSubject(subject);
          message.setSentDate(new Date());
          
//          // 메일 콘텐츠 설정
          Multipart mParts = new MimeMultipart();
          MimeBodyPart mTextPart = new MimeBodyPart();
          MimeBodyPart mFilePart = null;
 //    
//          // 메일 콘텐츠 - 내용
          mTextPart.setText(html, bodyEncoding, "html");
          mParts.addBodyPart(mTextPart);
//                
//          // 메일 콘텐츠 설정
          message.setContent(mParts);
     
          // 메일 발송
          Transport.send( message );
          System.out.println("인증번호 발송 완료!");
          
        } catch ( Exception e ) {
          e.printStackTrace();
        }

	}
	
//	인증번호 확인
	
	public boolean checkCode(String inputcode) {
		return code.equals(inputcode);
	}
	public static void main(String[] args) {
		UserField userField = new UserField();
		Scanner sc = new Scanner(System.in);
		String message = "인증번호를 입력하세요.\nex)755784 : ", inputcode = "";
		int count = 0;
		
		userField.randomNumber();
		userField.sendEmail("fpqk33@gmail.com");
		

		do {
			if(count == 0) {
				System.out.print(message);
				inputcode = sc.nextLine().trim();
				break;
			} else if (count > 0 && count < 3) {
				System.out.println("다시 입력하세요");
			} else {
				System.out.println("처음부터 다시 입력해주세요..");
				break;
			}
			count++;
		}while(!userField.checkCode(inputcode));
		
	}
}
