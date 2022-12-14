package LinkedList;

public class ListElem_Double {
        public int iData;              // Dana w elemencie listy (liczba calkowita)
        public ListElem_Double next;          // Referencja do następnego elementu listy
        public ListElem_Double previous;      /// Referencja do poprzedniego elementu listy

        public ListElem_Double(int iData) // konstruktor
        {
            this.iData = iData;   // Inicjalizacja danych
            next = null;
            previous = null;
        }

        public String toString()
        {
            return Integer.toString(iData);
        }
}
