package phone_director_lab;

    import java.util.TreeMap;
import java.util.Map;
    public class PhoneDirectoryWithTreeMap {
        private TreeMap<String,String> data;
        public PhoneDirectoryWithTreeMap() {
            this.data = new TreeMap<String,String>();
        }
        public String getNumber( String name ) {
            return   this.data.get(name);
        }
        public void putNumber( String name, String number ) {
            if (name == null || number == null)
                throw new IllegalArgumentException("name and number cannot be null");
            this.data.put(name,number);
        }

        /**  Write the contents of the phone directory to System.out.
         */
        public void print() {
            for (Map.Entry<String, String> entry : this.data.entrySet())
                System.out.println(entry.getKey() + ":  " + entry.getValue());
        }
        }

