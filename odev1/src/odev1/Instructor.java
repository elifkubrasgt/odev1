package odev1;


	public class Instructor extends User
	{
		public String explanation;

		public Instructor(int id, String name, String email, String password, String explanation) 
		{
			super(id, name, email, password);
			this.explanation = explanation;
		}

		public String getExplanation() {
			return explanation;
		}

		public void setExplanation(String explanation) {
			this.explanation = explanation;
		}

	}


