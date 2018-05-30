package org.crazyit.app.domain;

import javax.persistence.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@Entity
@Table(name="school_inf")
public class School
{
	// �����ʶ����
	@Id @Column(name="school_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// �����ѧУ��name��Ա����
	private String name;

	// �޲����Ĺ�����
	public School()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public School(String name)
	{
		this.name = name;
	}

	// id��setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}