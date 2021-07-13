public class InheritanceCompletion1 {
    public static void main(String[] args){

        Book b = new Book();
        b.setCode("001");// use setters to set values
        b.setDescription("the first book");
        b.setPrice(3.99);

        Book c = new Book();
        c.setCode("002");// use setters to set values
        c.setDescription("the second book");
        c.setPrice(5.99);
        c.setAuthor("Mark Twain");
        c.setPages(200);

        Software s = new Software();
        s.setCode("003");
        s.setDescription("the first software");
        s.setPrice(6.7435);
        s.setProgrammer("Bill Gates");
        s.setOS("Windows");
        s.setPlatform("PC");
        // use setters to set values

        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(s.toString());
    }
}
