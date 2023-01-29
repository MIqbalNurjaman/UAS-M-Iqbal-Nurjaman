

public class treesoal3binarytree {
    public static void main(String[] args) {
        Tree intTree = new Tree();

        //M. Iqbal Nurjaman
        //TIF PK 22
        //22552011257

        intTree.insert(23);
        intTree.insert(10);
        intTree.insert(54);
        intTree.insert(31);
        intTree.insert(17);
        intTree.insert(20);
        intTree.insert(25);
        intTree.insert(42);
        intTree.insert(32);
        intTree.insert(55);
        intTree.insert(16);
        intTree.insert(2);


        String s = " " ;

        System.out.println("Berikut merupakan dta yang di cari :");
        System.out.println(intTree.get(23));
        System.out.println(intTree.get(100));
        System.out.println(intTree.get(55));
        System.out.println(s);

        System.out.println("berikut data traverssl Order : ");
        intTree.traverseInOrder();
        System.out.println(s);
        System.out.println(s);

        System.out.println("data paling besar adalah "+intTree.max());
        System.out.println("data paling kecil adaalah "+intTree.min());
    }
}
