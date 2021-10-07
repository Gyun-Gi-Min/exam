public class Card {
    private  String shape;
    private  String value;

    public Card(String shape,String value){
        this.shape=shape;
        this.value=value;
    }
    public String getShape(){
        return this.shape; //카드모양 가져오기
    }
    public String getValue(){
        return this.value; //카드값 가져오기
    }

    @Override
    public String toString(){
        return String.format("%s (%s)",shape,value);
    }
}

//끝인가,...>?

//- 클래스명: Card
//
//- [3점] 카드모양(shape), 카드값(value)을 저장할 수 있는 멤버필드가 있다.
//
//- [3점] 멤버필드는 은닉화
//
//- [4점] 멤버필드에 값을 주입할 수 있는 생성자가 있다.
//
//- [3점] 카드모양 멤버필드의 값을 가져올 수 있는 getter메소드가 있다.
//
//- [3점] 카드값 멤버필드의 값을 가져올 수 있는 getter메소드가 있다.