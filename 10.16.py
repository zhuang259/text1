# -*- coding: utf-8 -*-

import os
class Price:
    ticket_d = 100
    ticket_w = ticket_d*1.2
    def rq(self):
        self.a = int(input(u'请输入是平日还是周末（平日：1/周末：0）：'))
        if self.a == 0:
            self.p = self.ticket_w
        if self.a == 1:
            self.p = self.ticket_d
    def pj(self):
        input(u'请输入是人数' + '\n')
        self.ad = int(input(u'大人数量：'))
        self.ch = int(input(u'儿童数量：'))
        self.money = self.p *self.ad + self.p *self.ch/2
        print('%f' % self.money)
 
class Ticket():
        def __init__(self, weekend=False, child=False):
                self.exp = 100
                if weekend:
                        self.inc = 1.2
                else:
                        self.inc = 1
                if child:
                        self.discount = 0.5
                else:
                        self.discount = 1
        def calcPrice(self, num):
                return self.exp * self.inc * self.discount * num
 
adult = Ticket()
child = Ticket(child=True)
print(u"2个成人 + 1个小孩平日票价为：%.2f" % (adult.calcPrice(2) + child.calcPrice(1)))
os.system('pause')