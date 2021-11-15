package dio.com.entities;

public class Obj extends ObjTree<Obj> {

	Integer myValue;
	
	public Obj(Integer myValue) {
		this.myValue = myValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myValue == null) ? 0 : myValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obj other = (Obj) obj;
		if (myValue == null) {
			if (other.myValue != null)
				return false;
		} else if (!myValue.equals(other.myValue))
			return false;
		return true;
	}

	@Override
	public int compareTo(Obj other) {
		int i =0;
		if(this.myValue > other.myValue) {
			i = 1;
		}else if(this.myValue < other.myValue) {
			i = -1;
		}
		
		return i;
	}

	@Override
	public String toString() {
		return myValue.toString();
	}
}
