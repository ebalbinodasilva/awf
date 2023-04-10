import openai
import uuid

openai.api_key = "YOUR_API_KEY_HERE"

def generate_response(prompt):
    response = openai.Completion.create(
        engine="davinci",
        prompt=prompt,
        max_tokens=2048,
        n=1,
        stop=None,
        temperature=0.7,
    )

    message = response.choices[0].text.strip()
    return message

while True:
    prompt = input("You: ")

    if prompt.lower() == "exit":
        break

    conversation_id = str(uuid.uuid4())
    response = generate_response(f"[{conversation_id}] You: {prompt}\nAI:")

    print(response)