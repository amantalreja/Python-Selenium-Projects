# %%
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import pickle
import os
import time
from selenium.webdriver import ActionChains

# %%
headers =   {
                "Connection": "keep-alive",
                "Sec-Fetch-Dest": "empty",
                "User-Agent": "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36",
                "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
                "Accept": "*/*",
                'Origin': "https://mlog.unitymedia.de",
                "Sec-Fetch-Site": "same-origin",
                "Sec-Fetch-Mode": "cors",
                "Referer": "https://mlog.unitymedia.de/mRic-app/mric?withSL",
                "Accept-Language": "en-US,en;q=0.9"
            }

data =  {
            "username": 'rtinircello',
            "password": 'SSolutions2020!',
            "client": "mRIC"
        }

url = "https://mlog.unitymedia.de/mRic-app/mric?withSL"


# %%
options= webdriver.ChromeOptions();
options.add_argument("--disable-blink-features=AutomationControlled");
options.add_experimental_option('useAutomationExtension', False);
options.add_argument("--log-level=3")
driver = webdriver.Chrome(options=options)

driver.get(url)


if os.path.exists('cookies.pkl'):
    cookies = pickle.load(open("cookies.pkl", "rb"))
    for cookie in cookies:
        driver.add_cookie(cookie)
else:
    pickle.dump(driver.get_cookies() , open("cookies.pkl","wb"))

# %%
login_name= driver.find_element_by_xpath("/html/body/div/div/div/div/div[2]/div[2]/input")
login_name.send_keys('Fortini.Marcello')

login_pass= driver.find_element_by_xpath("/html/body/div/div/div/div/div[3]/div[2]/div/input")
login_pass.send_keys('BKSSolutions2020!')
login_pass.send_keys(Keys.RETURN)

# %%
WebDriverWait(driver, 6000).until(EC.presence_of_element_located((By.XPATH, '/html/body/div/div/div[1]/ul[2]/li[1]/div')))
ansichten= driver.find_element_by_xpath('/html/body/div/div/div[1]/ul[2]/li[1]/div')
ansichten.click()

# %%
auftra= driver.find_element_by_id('mnuOrderMngmt')
auftra.click()

# %%
allordersmenu = driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/ul/li[1]/div/div');
allordersmenu.click();

# %%
allorders= driver.find_element_by_xpath('/html/body/ul/li[8]');
allorders.click();

# %%
WebDriverWait(driver, 6000).until(EC.presence_of_element_located((By.XPATH, '/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/ul/li[5]/div')))
filter_button= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/ul/li[5]/div')
filter_button.click()

# %%
status= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]');
status.click();

# %%
clean=driver.find_element_by_xpath('/html/body/ul/li[7]')
clean.click()


# %%
#reference= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[2]/div/input');

#reference.send_keys('6899790');

# %%
bearstep1= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[5]/div[1]/div[1]/div[3]/div/div[1]');
bearstep1.click();

# %%
bearstep2= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[5]/div[2]/div[2]/div[1]/div[2]');
bearstep2.click();

# %%
notextended= driver.find_element_by_xpath('/html/body/ul/li[15]');
notextended.click();

# %%
WebDriverWait(driver, 6000).until(EC.presence_of_element_located((By.XPATH, '/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[5]/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/textarea')))
middletext=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[5]/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/textarea');
middletext.send_keys('Genehmigung\nLOGISTIK\n2 Mann Termin');

# %%
komplex=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[8]/div[1]/div[1]/div[2]/div');
komplex.click();

# %%
nein= driver.find_element_by_xpath('/html/body/ul/li[2]');
nein.click();

# %%
mobilclick=driver.find_element_by_xpath('/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[25]/div[1]/div[1]/div[3]/div/div[1]');
mobilclick.click();
anotherfilter=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[25]/div[2]/div[2]/div[1]/div[2]')
anotherfilter.click();
nichtleer=driver.find_element_by_xpath('/html/body/ul/li[4]');
nichtleer.click();

# %%
fxclick= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[11]/div[1]/div[1]/div[3]/div/div[1]/div');
fxclick.click();

# %%
fxclickstep2=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[11]/div[2]/div[2]/div[1]/div[2]/div/div[1]');
fxclickstep2.click();

# %%
leer= driver.find_element_by_xpath('/html/body/ul/li[3]');
leer.click();

# %%
gasclick= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[34]/div[1]/div[1]/div[3]/div/div[1]/div')
gasclick.click();

# %%
gasfilter=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[34]/div[2]/div[2]/div[1]/div[2]/div/div[1]');
gasfilter.click();

# %%
mehrclick=driver.find_element_by_xpath('/html/body/ul/li[9]');
mehrclick.click();

# %%

wiltick=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[34]/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[3]/div/div[5]/div');
wiltick.click();

# %%

searchElement= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[34]/div[2]/div[2]/div[3]/div/div[1]/div/div/input');

searchElement.send_keys('WIL_s')

wiltick2=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[34]/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[3]/div/div[1]');
wiltick2.click();

# %%
wotyp=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[27]/div[1]/div[1]/div[3]/div/div[1]');
wotyp.click();

# %%
wotypstep2=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[27]/div[2]/div[2]/div[1]/div[2]');
wotypstep2.click();

# %%
wotypstep3=driver.find_element_by_xpath('/html/body/ul/li[15]');
wotypstep3.click();

# %%
wotypcheckbox=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[27]/div[2]/div[2]/div[2]/div[2]/div[2]');
wotypcheckbox.click();

# %%
wotypcheckbox2=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[27]/div[2]/div[2]/div[3]/div/div[1]/div[2]');
wotypcheckbox2.click();

# %%
wotyptext=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[27]/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/textarea');
wotyptext.send_keys('TBA\n'+
'TBN\n'+
'NE3\n'+
'NFA\n'+
'RFA\n'+
'EN1\n'+
'EN2\n'+
'EN3\n'+
'EN4\n'+
'SZT');

# %%
anwenden= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[2]/div/div[3]/div/div[1]');
anwenden.click();

# %%
def selectinternee(div):
    for i in range(10):
        try:
            rightclick= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div['+div+']/a');
        except:
            time.sleep(1);

    actionChains = ActionChains(driver)

    actionChains.context_click(rightclick).perform()

    # %%
    sendclick= driver.find_element_by_xpath('/html/body/ul/li[3]');
    sendclick.click()

    # %%
    WebDriverWait(driver, 6000).until(EC.element_to_be_clickable((By.XPATH, '/html/body/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div[2]/div[2]')))
    dropdownclick= driver.find_element_by_xpath('/html/body/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div[2]/div[2]');
    dropdownclick.click();
    
    # %%
    Sms_Kunde=driver.find_element_by_xpath('/html/body/ul/li[2]');
    Sms_Kunde.click();

    # %%
    textarea=driver.find_element_by_xpath('/html/body/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div[3]/div[2]/div/textarea');
    i=0;
    while len(textarea.text)==0:
        time.sleep(1);
        i=i+1
        if i>15:
            break;

    # %%
    mobilchecker= driver.find_element_by_xpath('/html/body/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/input');
    print (mobilchecker.get_attribute('value'))
    if len(mobilchecker.get_attribute('value'))<2:
        closebutton=driver.find_element_by_xpath('/html/body/div[2]/div/div[1]/ul/li[1]/div');
        closebutton.click();
        return;

    pressok=driver.find_element_by_xpath('/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]');
    pressok.click()

    # %%
    #clicktherightclick or the interneee first one
    WebDriverWait(driver, 10).until(EC.element_to_be_clickable((By.XPATH, '/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div[5]/a')))
    someint=0;
    while someint<10:

        try:
            rightclick.click();
            break;
        except:
            someint=someint+1;
            time.sleep(1)
            print('i am stucked here bro');


    # %%
    for i in range(10):
        try:
            VFinfo=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/ul/li[2]');
            VFinfo.click()
            break;
        except:
            time.sleep(1);
            print('couldnt find vinfo');
    

    # %%
    textbox=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/textarea');
    textbox.send_keys('SMS versendet')
    i=0;
    #print(textbox.get_attribute('value'))
    while i<60:
        
        if len(textbox.get_attribute('value'))>0:
            print(textbox.get_attribute('value'))
            break;
        else:
            textbox.send_keys('SMS versendet')
        time.sleep(1);
        i=i+1;
        


    # %%
    time.sleep(2)
    hinzufugen=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]');
    #hinzufugen.click()
    closer=driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[1]/ul/li[2]/div/div[2]');
    closer.click();


# %%
selectinternee(div='5')
selectinternee(div="10")
selectinternee(div="15")

numbertodo= 1
newnumber= 2

while True:   
    numbertodo= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div[20]/a').get_attribute('text');
    selectinternee(div="20");
    tempelement= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div['+'20'+']/a')
    i=0
    if tempelement.get_attribute('text')!=numbertodo:
        while tempelement.get_attribute('text')!=numbertodo:
            tempelement.send_keys(Keys.DOWN);
            tempelement= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div['+'20'+']/a')
            i=i+1;
            if i>1000:break;
    else:
        #tempelement.send_keys(Keys.DOWN);
        print('');
    tempelement.send_keys(Keys.DOWN);

    newnumber= driver.find_element_by_xpath('/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div[20]/a').get_attribute('text');
    if newnumber==numbertodo:break;

print('all done')


    





