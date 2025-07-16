public class Distribution {

    private DistributionStrategy distributionStrategy;

    public void distribuirArticulo(Articulo art){
        //logic
    }

    public DistributionStrategy getDistributionStrategy(){
        return distributionStrategy;
    }

    public void setDistrutionStrategy(DistributionStrategy dis){
        this.distributionStrategy= dis;
    }

}
