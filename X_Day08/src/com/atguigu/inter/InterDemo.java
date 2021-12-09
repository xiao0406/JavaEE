package com.atguigu.inter;

public class InterDemo {
}
interface InterFu{}

interface InterMu{}

interface InterA extends InterFu,InterMu{}

interface InterB{}

class Fu{}

class Zi extends Fu implements InterB,InterA{}
