package com.sro.coolsummer.rest;

import java.util.List;

public interface RestMapper {
	public abstract List<Rest> getAllRest();
	public abstract List<Rest> getRestplace(Rest r);
}
