package god8.referencetype;

public class ReferenceCostomer {

	public static void main(String[] args) {
		ReferenceCostomer reference = new ReferenceCostomer();
		System.out.println(reference.makeMemberObject());
	}
	
	public String makeMemberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("¹Î¼®");
		MemberDTO dto3 = new MemberDTO("¹Î¼®","6113");
		MemberDTO dto4 = new MemberDTO("¹Î¼®","6113","k@k.com");
		
		return dto4.toString();
	}
}
