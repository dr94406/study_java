package study.whiteship.extend;

    public  class Pegasus extends Horse implements Flyer, MyThical{
        public static void main(String[] args) {
            Pegasus pegasus = new Pegasus();
            System.out.println(pegasus.identityMySelf());
        }
}
