package com.bldea.crorepathi.package1;

import java.util.Scanner;

public class Questions {
	static String result;
	static String result2;
	static int count_life_line = 3;
	static int aud_phn = 1;
	static int cnt_50_50 = 1;
	static int skip_cnt = 1;
	static Scanner sc = new Scanner(System.in);

	public static boolean fetchQuestion1(String name) throws Exception {
		System.out.println("1. Who is the founder of Java?");
		System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(1000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(1000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							} 
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(1000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n"
												+ "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n"
												+ "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(1000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion2(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion3(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion4(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion5(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion6(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion7(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion8(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion9(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion10(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
						.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										Candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
								// --- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			}
			// changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}

		return false;
	}

}

//tinyurl.com/questions-class
