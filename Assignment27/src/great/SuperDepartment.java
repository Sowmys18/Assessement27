package great;

public class SuperDepartment {
	public String departmentName() {
			return "Super Department";
		}
		public String getTodaysWork() {
			return "No Work as of now";
		}
		
		public String getWorkDeadline() {
			return "Nil";
		}
		
		public String isTodayAHoliday() {
			return "Today is not a holiday";
		}
		
		public static void main(String[] args) {
			SuperDepartment adminObj = new AdminDepartment();
			System.out.println(adminObj.departmentName());
			System.out.println(adminObj.getTodaysWork());
			System.out.println(adminObj.getWorkDeadline());
			System.out.println(adminObj.isTodayAHoliday());
			System.out.println();
			
			SuperDepartment hrObj = new HrDepartment();
			System.out.println(hrObj.departmentName());
			  
			System.out.println(((HrDepartment) hrObj).doActivity());
			System.out.println(hrObj.getTodaysWork());
			System.out.println(hrObj.getWorkDeadline());
			System.out.println(hrObj.isTodayAHoliday());
			System.out.println();
			
			SuperDepartment techObj = new TechDepartment();
			System.out.println(techObj.departmentName());
			System.out.println(techObj.getTodaysWork());
			System.out.println(techObj.getWorkDeadline());
			System.out.println(((TechDepartment) techObj).getTechStackInformation());
			System.out.println(techObj.isTodayAHoliday());
			
		}
		
		
	}

	class AdminDepartment extends SuperDepartment{
		public String departmentName() {
			return "Admin Department";
		}
		public String getTodaysWork() {
			return "Complete your documents Submission";
		}
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
	}

	class HrDepartment extends SuperDepartment{
		public String departmentName() {
			return "Hr Department";
		}
		public String getTodaysWork() {
			return "Fill today’s worksheet and mark your attendance";
		}
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
		public String doActivity() {
			return "team Lunch";
		}
	}
		class TechDepartment extends SuperDepartment{
			public String departmentName() {
				return "Tech Department";
			}
			public String getTodaysWork() {
				return "Complete coding of module 1";
			}
			public String getWorkDeadline() {
				return "Complete by EOD";
			}
			public String getTechStackInformation() {
				return "core Java";
			}

	}

