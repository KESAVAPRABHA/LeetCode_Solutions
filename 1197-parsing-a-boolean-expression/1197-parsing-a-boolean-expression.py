class Solution(object):
    def parseBoolExpr(self, e,t=True,f=False):
        return eval(e.replace('!','not |').replace('&(','all([').replace('|(','any([').replace(')','])'))

        
        
        