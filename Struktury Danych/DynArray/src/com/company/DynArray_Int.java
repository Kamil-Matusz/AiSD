package com.company;

public class DynArray_Int {
    static private int [] table; // referencja do tablicy
    private int nElems;

    public DynArray_Int(int maxSize) {
        table = new int[maxSize];
        nElems = 0;
    }

    public void add(int value) {
        if(nElems >= table.length) {
            int [] locTable = new int[table.length*2];
            for(int i=0;i<table.length;i++) {
                locTable[i] = table[i];
            }
            table = locTable;
        }
        table[nElems] = value;
        nElems++;
    }

    public int get(int index) {
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

    public int find(int searchElement) {
        for(int j=0;j<nElems;j++)
            if (table[j] == searchElement)
                return j; // znaleziono element
        return -1; // elementu nie znaleziono
    }

    public void print() {
        for (int i=0;i<nElems;i++) {
            System.out.println(get(i) + " ");
        }
        System.out.println();
    }
}
