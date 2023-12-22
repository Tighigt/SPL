package org.example.ir.binaryop;

import org.example.ir.Node;

public class And extends AbstractBinaryOp {
    public And(Node left, Node right) {
        super(left, right);
    }

    @Override
    public void genCode() {
        left.genCode();
        right.genCode();
        System.out.println("&");
    }
}