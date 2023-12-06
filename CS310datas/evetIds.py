import json 
import os 

def gather_event_ids():
    event_ids = []
    files = [f for f in os.listdir('.') if f.endswith('.json')]

    for file in files:
        with open(file, 'r') as f:
            data = json.load(f)
            if isinstance(data, list):
                for item in data:
                    if isinstance(item, dict) and 'EventId' in item:
                        event_ids.append(item['EventId'])

    return event_ids

event_ids = gather_event_ids()
print(event_ids)

print(len(event_ids))