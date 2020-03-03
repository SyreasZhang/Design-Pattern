package hk5;

public class MyComputer implements OldComputer, NewComputer {
    private AbstractMemory memory;
    private AbstractCPU CPU;
    
    
	@Override
	public void update() {
		memory.setSize(memory.getSize()*2);
		CPU.setFrequency(CPU.getFrequency()*2);
		show();
	}
	@Override
	public void show() {
		System.out.println(String.format("这是一个%dG内存,CUP主屏%.2fHZ的电脑", memory.getSize(),CPU.getFrequency()));
	}
	public AbstractMemory getMemory() {
		return memory;
	}
	public void setMemory(AbstractMemory memory) {
		this.memory = memory;
	}
	public AbstractCPU getCPU() {
		return CPU;
	}
	public void setCPU(AbstractCPU cPU) {
		CPU = cPU;
	}

}
