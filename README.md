# 🚀 프로젝트명 (Project Title)

> **프로젝트 한줄 소개** > 예: 지역 기반 중고 거래 플랫폼, 당근마켓 클론 코딩 프로젝트입니다.

[![GitHub Stars](https://img.shields.io/github/stars/junhyun1001/YOUR_REPO_NAME?style=social)](https://github.com/junhyun1001/YOUR_REPO_NAME)
[![GitHub Forks](https://img.shields.io/github/forks/junhyun1001/YOUR_REPO_NAME?style=social)](https://github.com/junhyun1001/YOUR_REPO_NAME)
[![Issue Count](https://img.shields.io/github/issues/junhyun1001/YOUR_REPO_NAME)](https://github.com/junhyun1001/YOUR_REPO_NAME/issues)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-green)](https://spring.io/projects/spring-boot)

---

## 📝 목차 (Table of Contents)

1. [프로젝트 소개 (About)](#-프로젝트-소개-about)
2. [주요 기능 (Key Features)](#-주요-기능-key-features)
3. [기술 스택 (Tech Stack)](#%EF%B8%8F-기술-스택-tech-stack)
4. [시스템 아키텍처 및 ERD (Architecture & ERD)](#-시스템-아키텍처-및-erd)
5. [시작 가이드 (Getting Started)](#-시작-가이드-getting-started)
6. [API 명세 (API Documentation)](#-api-명세-api-documentation)
7. [프로젝트 구조 (Project Structure)](#-프로젝트-구조-project-structure)

---

## 🌟 프로젝트 소개 (About)

이 프로젝트는 **[프로젝트의 구체적인 목적]**을 위해 개발되었습니다. 
사용자들에게 **[어떤 가치]**를 제공하며, **[어떤 문제]**를 해결하고자 합니다.

---

## ✨ 주요 기능 (Key Features)

* **📝 게시글 관리**
  * 상품 등록, 수정, 삭제, 상세 조회 기능
  * 이미지 업로드 및 관리
* **📍 지역 기반 검색**
  * 사용자 위치(동네) 인증 시스템
  * 현재 설정된 지역 기반 상품 목록 필터링 및 조회
* **🌡️ 사용자 신뢰도 (매너온도)**
  * 거래 후기(`review`) 시스템을 통한 매너 온도 계산
  * 사용자 프로필 및 활동 내역 조회
* **🤝 거래 관리**
  * 상품 상태 변경 (판매 중 ↔ 예약 중 ↔ 판매 완료)
  * 구매자 확정 및 거래 완료 처리
* **❤️ 관심 목록 (찜 기능)**
  * 게시글 찜 하기 / 찜 취소
  * 내가 찜한 목록 모아보기

---

## ⚙️ 기술 스택 (Tech Stack)

| 카테고리 | 기술 스택 | 사용 이유 및 비고 |
| :--- | :--- | :--- |
| **Language** | Java 17 | 안정성과 성능을 위한 LTS 버전 선택 |
| **Framework** | Spring Boot 3.x | 내장 WAS를 통한 빠른 개발 및 쉬운 환경 설정 |
| **ORM** | Spring Data JPA, Hibernate | 객체 지향적인 DB 접근 및 생산성 확보, 유지보수 용이 |
| **Database** | PostgreSQL / MySQL | 대용량 데이터 처리 및 안정적인 트랜잭션 관리 |
| **Build Tool** | Gradle | 유연한 빌드 스크립트 작성 및 의존성 관리 |
| **Infra** | Oracle Cloud (OCI) | 클라우드 환경 배포 (Always Free) |

---

## 📐 시스템 아키텍처 및 ERD

### 🏗 Architecture
> (아키텍처 다이어그램 이미지를 여기에 첨부하세요. 예: `![Architecture](./assets/arch.png)`)

### 🗂 ERD (Entity Relationship Diagram)
> (ERD 이미지를 여기에 첨부하세요. 예: `![ERD](./assets/erd.png)`)

---

## 🏁 시작 가이드 (Getting Started)

이 프로젝트를 로컬 환경에서 실행하기 위한 가이드입니다.

### 1. 사전 요구 사항 (Prerequisites)
* Java 17 이상
* MySQL 또는 PostgreSQL
* Git

### 2. 설치 및 실행 (Installation)

```bash
# 1. 레포지토리 클론
$ git clone [https://github.com/junhyun1001/YOUR_REPO_NAME.git](https://github.com/junhyun1001/YOUR_REPO_NAME.git)

# 2. 프로젝트 디렉토리로 이동
$ cd YOUR_REPO_NAME

# 3. 의존성 설치 및 빌드
$ ./gradlew build

# 4. 실행
$ ./gradlew bootRun
