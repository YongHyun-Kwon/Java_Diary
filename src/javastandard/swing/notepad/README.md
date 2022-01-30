# Swing으로 만든 메모장

- File의 새글, 닫기 서식의 글꼴만 구현
- Design과 Event는 Has A관계로 구현
- Event
  - 새글 - JTextArea를 초기화
  - 닫기 - Window 종료
  - 서식 - 글꼴 다이얼로그를 띄운다.
- Dialog Event
  - 글꼴 리스트 - 돋움, 맑은 고딕, 궁서체, Serif, SansSerif
  - 글꼴 리스트의 Item이 선택되면 글꼴 TextField에 설정한 후 설정된 상태가 Preview에 반영
  - 글꼴 스타일 리스트의 Item이 선택되면 글꼴 TextField에 설정 후 상태가 Preview에 반영
  - 글꼴 크기 리스트의 Item이 선택되면 TextField에 설정 후 상태가 Preview에 반영
  - 확인 버튼이 클릭되면 현재 글꼴 설정상태가 부모창의 JTextArea에 반영되고 JDialog 종료
  - 취소 버튼이 클릭되면 JDialog가 즉시 종료
  - JList는 javax.swing.event.ListSelectionListener을 사용
- 파일의 저장, 다른이름으로 저장 열기, 도움말의 메모장 정보는 추후 구현예정
