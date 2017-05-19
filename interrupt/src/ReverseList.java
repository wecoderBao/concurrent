import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class ReverseList<T> extends ArrayList<T>{

	private static final long serialVersionUID = 1L;
	
	public ReverseList(Collection<T> c){ super(c);}
	
	public Iterable<T> reversed(){
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				
				return new Iterator<T>() {
					int cursor = ReverseList.this.size();
					
					@Override
					public boolean hasNext() {	
						return cursor != 0;
					}

					@Override
					public T next() {
						int i = cursor-1;
						
	                    if (i < 0)
	                        throw new NoSuchElementException();
	                    Object[] elementData = ReverseList.this.toArray();
	                    if (i >= elementData.length)
	                        throw new ConcurrentModificationException();
	                    cursor = i ;
	                    return (T) elementData[i];
					}
				};
			}
		};
	}
}
