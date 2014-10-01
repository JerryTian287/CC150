
public class ThreeStack {
	int stackSize = 300;
	int indexUsed = 0;
	int [] stackPointer = {-1, -1, -1};
	StackNode [] buffer = new StackNode[3 * stackSize];
	
	void push(int stackNum, int value) {
		int lastIndex = stackPointer[stackNum];
		stackPointer[stackNum] = indexUsed;
		indexUsed++;
		buffer[stackPointer[stackNum]] = new StackNode(lastIndex, value);
	}
	
	int pop(int stackNum) {
		int value = buffer[stackPointer[stackNum]].val;
		int lastIndex = stackPointer[stackNum];
		stackPointer[stackNum] = buffer[stackPointer[stackNum]].pre;
		buffer[lastIndex] = null;
		indexUsed--;
		return value;
	}
	
	int peek(int stackNum) {
		return buffer[stackPointer[stackNum]].val;
	}
	
	boolean isEmpty(int stackNum) {
		return stackPointer[stackNum] == -1;
	}
}
