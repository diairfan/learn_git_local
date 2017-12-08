class Mobil
{
    //  Kelas Mobil mempunyai variable Warna dan Merk
    String warna = "Merah";
    String merk = "BMW";
    //private String nama;
}
class Garasi{
private int alas= 10;
private int tinggi=6;
private int luas;

void cari(){
System.out.println("alas = "+alas);
System.out.println("tinggi = "+tinggi);
luas=(int) (alas*tinggi*0.5);
System.out.println("luas = "+luas);
}
}
class Person {
    
        
    private int age;
    private String name;
    private String PersonId;
    
    public void setAge(int newValue) {
        age = newValue;
    }
    public void setName (String newValue){
        name = newValue;
    }
    public void setPersonId(String newValue){
        PersonId = newValue;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getPersonId(){
        return PersonId;
    
    }
    
    }
//public void setNama(String nama){
  //  this.nama=nama;
  
public class Rumah
{
    public static void main(String[] args)
    
    {
        /*  Mencoba memanggil Warna dan Merk yang
            berada di kelas Mobil. Caranya ialah
            membuat objek dari kelas Mobil  */

            Person ren = new Person();
            ren.setAge(19);
            ren.setName("Irfan Syaripudin");
            ren.setPersonId("13121994");
                   
            Garasi tes= new Garasi();
            tes.cari();
            Mobil obj_mobil = new Mobil();
        
        
        //  Memanggil variable Warna dan Merk di kelas Mobil
        System.out.println("\nMy Name Is : " +ren.getName() +"\nMy Age : "+ ren.getAge()+"\nMy Id :"+ ren.getPersonId());
        
        System.out.println("Warna Mobil : "+obj_mobil.warna);
        System.out.println("Merk Mobil  : "+obj_mobil.merk);

        
    }
}
