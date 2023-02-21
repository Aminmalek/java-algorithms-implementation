public class HashMap {    private int size;    private final DataItem[] list = new DataItem[20];    public int getSize() {        return size;    }    public void setSize(int size) {        this.size = size;    }    public int hashCode(int key) {        return key % size;    }    public void insert(int key, int value) {        DataItem dataItem = new DataItem(key, value);        int index = hashCode(key);        if (list[index] != null) {            for (int i = index+1; i == index+1; i++) {                if (list[i] == null) {                    list[i] = dataItem;                } else {                    i++;                }            }        } else {            list[index] = dataItem;        }    }    public int getValue(int key) {        int index = hashCode(key);        if (list[index].getKey() != key) {            for (int i = index+1; i == index+1; i++) {                if (list[i].getKey() == key) {                    return list[i].getValue();                } else {                    i++;                }            }        }else{            return list[index].getValue();        }        return -1;    }    public void displayHashtable() {            for (int i = 0; i < list.length; i++) {                System.out.printf("list %d ==> ", i);                if (list[i] != null) {                    System.out.println(list[i].getKey() + " : " + list[i].getValue());                } else {                    System.out.println(" null");                }            }        }    public static class DataItem {        private final int key;        private final int value;        public DataItem(int key, int value) {            this.key = key;            this.value = value;        }        public int getKey() {            return key;        }        public int getValue() {            return value;        }    }    public static void main(String[] args) {        HashMap hMap = new HashMap();        hMap.setSize(20);        hMap.insert(42, 20);        hMap.insert(22, 30);        hMap.displayHashtable();        System.out.println("value is "+hMap.getValue(22));        //System.out.println(hMap.getValue(42));    }}