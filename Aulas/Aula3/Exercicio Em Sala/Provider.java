public class Provider extends Person implements IProvider {

    private String document;
    public Provider(){
    super();
    }

    public Provider(int id, String name){
    super(id, name);
    }

    public Provider(int id, String name, String document){
        this.setId(id);
        this.setName(name);
        this.document = document;
    }
    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    @Override
    public int getSizeDocument() {
        return this.document.length();
    }


}