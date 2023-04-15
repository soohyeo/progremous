'''

    환전금액 = 한국돈 / 매매기준율

    예) 환전 금액(원)을 입력하세요 : 1000원
        국가를 입력하세요 : 중국
        1000원은 5.05 위안입니다.

    예) 환전 금액(원)을 입력하세요 : 1000원
        국가를 입력하세요 : 미국
        1000원은 0.75 달러입니다.

    예) 환전 금액(원)을 입력하세요 : 1000원
        국가를 입력하세요 : 필리핀
        해당 국가 정보가 없습니다.
'''
country_list = ['미국','중국','유럽','일본']
unit = ['달러','위안','유로','엔']
rate = [1313.00, 190.16,1432.15,979.96]

def exchange(money, country):
    if country in country_list:
        code = country_list.index(country)
    else:
        print ("하당 국가 정보가 없습니다.")
        return

    result = round(money / rate[code], 2)
    print(money, "원은", result, unit[code], "입니다.")



money1 = int(input("환경 금액(원)을 입력하세요 : "))
country1 = input("국가를 입력하세요 :")
exchange(money1, country1)