package DynArray;

public class DynArray_Object {
    private Object [] table; // referencja do tablicy
    private int nElems;

    public DynArray_Object(int maxSize) {
        table = new Object[maxSize];
        nElems = 0;
    }

    public void add(Object value) {
        if(nElems >= table.length) {
            Object [] locTable = new Object[table.length * 2];
            for(int i=0;i<table.length;i++) {
                locTable[i] = table[i];
            }
            table = locTable;
        }
        table[nElems] = value;
        nElems++;
    }

    public Object get(int index) {
        return table[index];
    }

    public int size() { // aktualna liczba elementów w tablicy
        return nElems;
    }

    public boolean remove(int index) {
        if(nElems ==0 || index>=nElems || index<0)
            return false;
        for(int j=index;j<nElems-1;j++) // przesuwamy pozostałe elementy w lewo
            table[j] = table[j+1];
        nElems--;
        return true;
    }

    public int find(Object searchElement) {
        for(int j=0;j<nElems;j++)
            if (table[j].equals(searchElement))
                return j; // znaleziono element
        return -1; // elementu nie znaleziono
    }

    public void print() {
        for (int i=0;i<nElems;i++) {
            System.out.println(get(i).toString() + " ");
        }
        System.out.println();
    }
}
