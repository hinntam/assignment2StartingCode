/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementations;

/**
 *
 * @author mailt
 */
public interface StackADT<T> {
    public void Clear_Size();
    public boolean Contains_True();
    public boolean  Contains_False();
    public boolean Equals_True();
    public boolean Equals_False();
    public boolean IsEmpty_True();
    public boolean IsEmpty_False();
    public void Peek_Top();
    public void Peek_Empty();
    public void Pop_Top();
    public void Pop_Empty();
    public void Push_Top();
    public void Push_NullPointerException();
    public void Search_Botton();
}
