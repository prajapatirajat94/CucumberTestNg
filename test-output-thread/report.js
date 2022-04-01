$(document).ready(function() {
CucumberHTML.timelineItems.pushArray([
  {
    "id": "5e6a4b58-b34a-48f9-83b2-8a575d51f24d",
    "feature": "checking login feature of application",
    "scenario": "login in to application by entering url",
    "start": 1648773117818,
    "group": 14,
    "content": "",
    "tags": "@login,",
    "end": 1648773135363,
    "className": "passed"
  },
  {
    "id": "3146e52a-12da-4b6f-9892-8e2ad765b4cb",
    "feature": "Verifying homepage",
    "scenario": "verifying login page of walmart",
    "start": 1648773117818,
    "group": 15,
    "content": "",
    "tags": "@homepage,",
    "end": 1648773132473,
    "className": "failed"
  }
]);
CucumberHTML.timelineGroups.pushArray([
  {
    "id": 14,
    "content": "Thread[TestNG-PoolService-0,5,main]"
  },
  {
    "id": 15,
    "content": "Thread[TestNG-PoolService-1,5,main]"
  }
]);
});