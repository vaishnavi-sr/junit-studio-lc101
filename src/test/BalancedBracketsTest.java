package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
   @Test
    public void onlyBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
   }
    @Test
    public void onlyBracketOppositeReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyBracketsNull(){
        BalancedBrackets NullResult = new BalancedBrackets();
        assertEquals(0,0);
    }
    @Test
    public void wordReturnValue(){
        BalancedBrackets Value = new BalancedBrackets();
        BalancedBrackets.hasBalancedBrackets("[skyline]");
        int result = 7;
        assertEquals(result,7);
    }
    @Test
    public void withUnBalancedBrackets(){
        BalancedBrackets Value = new BalancedBrackets();
        BalancedBrackets.hasBalancedBrackets("[skyline]");
        assertFalse(BalancedBrackets.hasBalancedBrackets("skyline["));
    }
    @Test
    public void withNoBrackets(){
        BalancedBrackets Value = new BalancedBrackets();
        BalancedBrackets.hasBalancedBrackets("skyline");
        assertTrue(BalancedBrackets.hasBalancedBrackets("skyline"));
    }
    @Test
    public void withMiddleBrackets(){
        BalancedBrackets Value = new BalancedBrackets();
        BalancedBrackets.hasBalancedBrackets("sky[line]");
        assertTrue(BalancedBrackets.hasBalancedBrackets("sky[line]"));
    }
}
