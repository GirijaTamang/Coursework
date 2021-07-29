#!/usr/bin/env python
# coding: utf-8

# In[1]:


#Importing required packages for predecting wine quality.
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import confusion_matrix, classification_report,accuracy_score
from sklearn.preprocessing import StandardScaler, LabelEncoder
from sklearn.model_selection import train_test_split, cross_val_score


# In[2]:


#data reading
df = pd.read_csv('red.csv')


# In[3]:


df.head()


# In[4]:


df.count()
df.info()
df.isnull().any() 


# In[5]:


# initial visual analysis
for label in df.columns[:-1]:
# for label in ['alcohol']:
    plt.scatter(df['quality'], df[label])
    plt.title(label)
    plt.xlabel('quality')
    plt.ylabel(label)
    plt.show()


# In[6]:


#Preprocessing Data for performing Machine learning algorithms
bins = [0, 6.5, 9] # this means 1-6.5 are bad, 6.5- 9 are good
labels = [0, 1]
df['quality'] = pd.cut(df['quality'], bins=bins, labels=labels)


# In[7]:


df.head()


# In[8]:


x = df[df.columns[:-1]]
y = df['quality']
sc = StandardScaler()
x = sc.fit_transform(x)

x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=.2, random_state=42)


# In[9]:


for data in [y_train, y_test]:
    print(data.describe())


# In[10]:


rf = RandomForestClassifier(n_estimators=100)
rf.fit(x_train, y_train)
pred_rf = rf.predict(x_test)
print(classification_report(y_test, pred_rf))
pred1 = accuracy_score(y_test,pred_rf)
print(pred1*100)

