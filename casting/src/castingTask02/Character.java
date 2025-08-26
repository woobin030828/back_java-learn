package castingTask02;

class Character {
	String name, skill, skills;
	int age, job, limitBreakGauge, hp;
	
//	1. 용기사
//	2. 리퍼
//	3. 아이스메이지
	
	public Character() {;}
	public Character(String name, int job) {
		this.name = name;
		this.job = job;
		this.hp = 20;
	} 
	
	String limitBreake() {
		switch (this.job) {
		case 1:
			return "전쟁의 여신 할로네여! 내게 용의 힘을! 창룡강타!";
		case 2:
			return "여기서 사라져줘야겠다... 사멸하라!";
		case 3:
			return "산산히 조각나라! 다이아몬드 더스트!";
		default:
			return "아직 직업이 없어서 사용 할 수 없어";
		}
	}
	
	void huntrix(Monstar monstar) {
		monstar.hunt();
		if (monstar instanceof Orc) {
			Orc orc = (Orc)monstar;
			orc.kill();
		} else if (monstar instanceof Fairy) {
			Fairy fairy = (Fairy)monstar;
			fairy.tears();
		} else if (monstar instanceof Humen) {
			Humen humen = (Humen)monstar;
			humen.clise();
		} else if (monstar instanceof Innocence) {
			Innocence innocence = (Innocence)monstar;
			innocence.firstStart();
		}
	}
	
}
