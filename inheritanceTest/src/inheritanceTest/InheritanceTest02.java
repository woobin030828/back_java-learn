package inheritanceTest;

class AA {
   void paint() {
      System.out.print("A");
      draw();
   }
   
   void draw() {
      System.out.print("B");
   }
}


class BB extends AA {
   @Override
   void paint() {
      super.draw(); // B
      System.out.print("C"); // C
      this.draw(); // D
   }

   @Override
   void draw() {
      System.out.print("D"); // D
   }
}

public class InheritanceTest02 {
   public static void main(String[] args) {
      BB b = new BB(); // 사유: 호출은 결국 main에서 호출 될 때를 기준으로 하기 때문에, 이미 객체화가 진행되었을 때, this.draw()는 오버라이딩이 완료된 상태였다.
      b.paint(); // B, C, D
      b.draw(); // D
   }

}
