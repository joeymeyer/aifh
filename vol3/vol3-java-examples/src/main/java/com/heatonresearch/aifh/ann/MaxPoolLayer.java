/*
 * Artificial Intelligence for Humans
 * Volume 3: Deep Learning and Neural Networks
 * Java Version
 * http://www.aifh.org
 * http://www.jeffheaton.com
 *
 * Code repository:
 * https://github.com/jeffheaton/aifh
 *
 * Copyright 2014-2015 by Jeff Heaton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For more information on Heaton Research copyrights, licenses
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package com.heatonresearch.aifh.ann;

import com.heatonresearch.aifh.ann.activation.ActivationFunction;
import com.heatonresearch.aifh.ann.train.GradientCalc;
import com.heatonresearch.aifh.randomize.GenerateRandom;

/**
 * Not currently used.  Will soon support maxpooling layers.
 */
public class MaxPoolLayer implements Layer {

    /**
     * Construct a max pooling layer.
     * @param count The counts.
     */
    public MaxPoolLayer(int[] count) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getCount() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getTotalCount() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActivationFunction getActivation() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void finalizeStructure(BasicNetwork theOwner, int theLayerIndex, TempStructureCounts counts) {

    }


    @Override
    public void computeLayer() {

    }

    @Override
    public void computeGradient(GradientCalc calc) {

    }

    @Override
    public int getWeightIndex() {
        return 0;
    }

    @Override
    public int getNeuronIndex() {
        return 0;
    }


    @Override
    public int getLayerIndex() { return 0; }

    @Override
    public void trainingBatch(GenerateRandom rnd) {

    }

    @Override
    public BasicNetwork getOwner() {
        return null;
    }

    @Override
    public boolean isActive(int i) {
        return false;
    }

    @Override
    public boolean hasBias() {
        return true;
    }

    @Override
    public int[] getDimensionCounts() {
        return new int[0];
    }

    @Override
    public int getWeightDepthUnit() {
        return 0;
    }

    @Override
    public int getNeuronDepthUnit() {
        return 0;
    }
}
