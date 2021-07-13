// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ShardingInstanceMongoList struct {
	// Mongo node connection string
	ConnectString *string `pulumi:"connectString"`
	// -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
	NodeClass string `pulumi:"nodeClass"`
	// The ID of the shard-node.
	NodeId *string `pulumi:"nodeId"`
	// Mongo node port
	// * `shardList`
	Port *int `pulumi:"port"`
}

// ShardingInstanceMongoListInput is an input type that accepts ShardingInstanceMongoListArgs and ShardingInstanceMongoListOutput values.
// You can construct a concrete instance of `ShardingInstanceMongoListInput` via:
//
//          ShardingInstanceMongoListArgs{...}
type ShardingInstanceMongoListInput interface {
	pulumi.Input

	ToShardingInstanceMongoListOutput() ShardingInstanceMongoListOutput
	ToShardingInstanceMongoListOutputWithContext(context.Context) ShardingInstanceMongoListOutput
}

type ShardingInstanceMongoListArgs struct {
	// Mongo node connection string
	ConnectString pulumi.StringPtrInput `pulumi:"connectString"`
	// -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
	NodeClass pulumi.StringInput `pulumi:"nodeClass"`
	// The ID of the shard-node.
	NodeId pulumi.StringPtrInput `pulumi:"nodeId"`
	// Mongo node port
	// * `shardList`
	Port pulumi.IntPtrInput `pulumi:"port"`
}

func (ShardingInstanceMongoListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ShardingInstanceMongoList)(nil)).Elem()
}

func (i ShardingInstanceMongoListArgs) ToShardingInstanceMongoListOutput() ShardingInstanceMongoListOutput {
	return i.ToShardingInstanceMongoListOutputWithContext(context.Background())
}

func (i ShardingInstanceMongoListArgs) ToShardingInstanceMongoListOutputWithContext(ctx context.Context) ShardingInstanceMongoListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShardingInstanceMongoListOutput)
}

// ShardingInstanceMongoListArrayInput is an input type that accepts ShardingInstanceMongoListArray and ShardingInstanceMongoListArrayOutput values.
// You can construct a concrete instance of `ShardingInstanceMongoListArrayInput` via:
//
//          ShardingInstanceMongoListArray{ ShardingInstanceMongoListArgs{...} }
type ShardingInstanceMongoListArrayInput interface {
	pulumi.Input

	ToShardingInstanceMongoListArrayOutput() ShardingInstanceMongoListArrayOutput
	ToShardingInstanceMongoListArrayOutputWithContext(context.Context) ShardingInstanceMongoListArrayOutput
}

type ShardingInstanceMongoListArray []ShardingInstanceMongoListInput

func (ShardingInstanceMongoListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ShardingInstanceMongoList)(nil)).Elem()
}

func (i ShardingInstanceMongoListArray) ToShardingInstanceMongoListArrayOutput() ShardingInstanceMongoListArrayOutput {
	return i.ToShardingInstanceMongoListArrayOutputWithContext(context.Background())
}

func (i ShardingInstanceMongoListArray) ToShardingInstanceMongoListArrayOutputWithContext(ctx context.Context) ShardingInstanceMongoListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShardingInstanceMongoListArrayOutput)
}

type ShardingInstanceMongoListOutput struct{ *pulumi.OutputState }

func (ShardingInstanceMongoListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ShardingInstanceMongoList)(nil)).Elem()
}

func (o ShardingInstanceMongoListOutput) ToShardingInstanceMongoListOutput() ShardingInstanceMongoListOutput {
	return o
}

func (o ShardingInstanceMongoListOutput) ToShardingInstanceMongoListOutputWithContext(ctx context.Context) ShardingInstanceMongoListOutput {
	return o
}

// Mongo node connection string
func (o ShardingInstanceMongoListOutput) ConnectString() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ShardingInstanceMongoList) *string { return v.ConnectString }).(pulumi.StringPtrOutput)
}

// -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
func (o ShardingInstanceMongoListOutput) NodeClass() pulumi.StringOutput {
	return o.ApplyT(func(v ShardingInstanceMongoList) string { return v.NodeClass }).(pulumi.StringOutput)
}

// The ID of the shard-node.
func (o ShardingInstanceMongoListOutput) NodeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ShardingInstanceMongoList) *string { return v.NodeId }).(pulumi.StringPtrOutput)
}

// Mongo node port
// * `shardList`
func (o ShardingInstanceMongoListOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v ShardingInstanceMongoList) *int { return v.Port }).(pulumi.IntPtrOutput)
}

type ShardingInstanceMongoListArrayOutput struct{ *pulumi.OutputState }

func (ShardingInstanceMongoListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ShardingInstanceMongoList)(nil)).Elem()
}

func (o ShardingInstanceMongoListArrayOutput) ToShardingInstanceMongoListArrayOutput() ShardingInstanceMongoListArrayOutput {
	return o
}

func (o ShardingInstanceMongoListArrayOutput) ToShardingInstanceMongoListArrayOutputWithContext(ctx context.Context) ShardingInstanceMongoListArrayOutput {
	return o
}

func (o ShardingInstanceMongoListArrayOutput) Index(i pulumi.IntInput) ShardingInstanceMongoListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ShardingInstanceMongoList {
		return vs[0].([]ShardingInstanceMongoList)[vs[1].(int)]
	}).(ShardingInstanceMongoListOutput)
}

type ShardingInstanceShardList struct {
	// -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
	NodeClass string `pulumi:"nodeClass"`
	// The ID of the shard-node.
	NodeId *string `pulumi:"nodeId"`
	// - Custom storage space; value range: [10, 1,000]
	// - 10-GB increments. Unit: GB.
	NodeStorage int `pulumi:"nodeStorage"`
	// The number of read-only nodes in shard node. Valid values: 0 to 5. Default value: 0.
	ReadonlyReplicas *int `pulumi:"readonlyReplicas"`
}

// ShardingInstanceShardListInput is an input type that accepts ShardingInstanceShardListArgs and ShardingInstanceShardListOutput values.
// You can construct a concrete instance of `ShardingInstanceShardListInput` via:
//
//          ShardingInstanceShardListArgs{...}
type ShardingInstanceShardListInput interface {
	pulumi.Input

	ToShardingInstanceShardListOutput() ShardingInstanceShardListOutput
	ToShardingInstanceShardListOutputWithContext(context.Context) ShardingInstanceShardListOutput
}

type ShardingInstanceShardListArgs struct {
	// -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
	NodeClass pulumi.StringInput `pulumi:"nodeClass"`
	// The ID of the shard-node.
	NodeId pulumi.StringPtrInput `pulumi:"nodeId"`
	// - Custom storage space; value range: [10, 1,000]
	// - 10-GB increments. Unit: GB.
	NodeStorage pulumi.IntInput `pulumi:"nodeStorage"`
	// The number of read-only nodes in shard node. Valid values: 0 to 5. Default value: 0.
	ReadonlyReplicas pulumi.IntPtrInput `pulumi:"readonlyReplicas"`
}

func (ShardingInstanceShardListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ShardingInstanceShardList)(nil)).Elem()
}

func (i ShardingInstanceShardListArgs) ToShardingInstanceShardListOutput() ShardingInstanceShardListOutput {
	return i.ToShardingInstanceShardListOutputWithContext(context.Background())
}

func (i ShardingInstanceShardListArgs) ToShardingInstanceShardListOutputWithContext(ctx context.Context) ShardingInstanceShardListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShardingInstanceShardListOutput)
}

// ShardingInstanceShardListArrayInput is an input type that accepts ShardingInstanceShardListArray and ShardingInstanceShardListArrayOutput values.
// You can construct a concrete instance of `ShardingInstanceShardListArrayInput` via:
//
//          ShardingInstanceShardListArray{ ShardingInstanceShardListArgs{...} }
type ShardingInstanceShardListArrayInput interface {
	pulumi.Input

	ToShardingInstanceShardListArrayOutput() ShardingInstanceShardListArrayOutput
	ToShardingInstanceShardListArrayOutputWithContext(context.Context) ShardingInstanceShardListArrayOutput
}

type ShardingInstanceShardListArray []ShardingInstanceShardListInput

func (ShardingInstanceShardListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ShardingInstanceShardList)(nil)).Elem()
}

func (i ShardingInstanceShardListArray) ToShardingInstanceShardListArrayOutput() ShardingInstanceShardListArrayOutput {
	return i.ToShardingInstanceShardListArrayOutputWithContext(context.Background())
}

func (i ShardingInstanceShardListArray) ToShardingInstanceShardListArrayOutputWithContext(ctx context.Context) ShardingInstanceShardListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShardingInstanceShardListArrayOutput)
}

type ShardingInstanceShardListOutput struct{ *pulumi.OutputState }

func (ShardingInstanceShardListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ShardingInstanceShardList)(nil)).Elem()
}

func (o ShardingInstanceShardListOutput) ToShardingInstanceShardListOutput() ShardingInstanceShardListOutput {
	return o
}

func (o ShardingInstanceShardListOutput) ToShardingInstanceShardListOutputWithContext(ctx context.Context) ShardingInstanceShardListOutput {
	return o
}

// -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
func (o ShardingInstanceShardListOutput) NodeClass() pulumi.StringOutput {
	return o.ApplyT(func(v ShardingInstanceShardList) string { return v.NodeClass }).(pulumi.StringOutput)
}

// The ID of the shard-node.
func (o ShardingInstanceShardListOutput) NodeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ShardingInstanceShardList) *string { return v.NodeId }).(pulumi.StringPtrOutput)
}

// - Custom storage space; value range: [10, 1,000]
// - 10-GB increments. Unit: GB.
func (o ShardingInstanceShardListOutput) NodeStorage() pulumi.IntOutput {
	return o.ApplyT(func(v ShardingInstanceShardList) int { return v.NodeStorage }).(pulumi.IntOutput)
}

// The number of read-only nodes in shard node. Valid values: 0 to 5. Default value: 0.
func (o ShardingInstanceShardListOutput) ReadonlyReplicas() pulumi.IntPtrOutput {
	return o.ApplyT(func(v ShardingInstanceShardList) *int { return v.ReadonlyReplicas }).(pulumi.IntPtrOutput)
}

type ShardingInstanceShardListArrayOutput struct{ *pulumi.OutputState }

func (ShardingInstanceShardListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ShardingInstanceShardList)(nil)).Elem()
}

func (o ShardingInstanceShardListArrayOutput) ToShardingInstanceShardListArrayOutput() ShardingInstanceShardListArrayOutput {
	return o
}

func (o ShardingInstanceShardListArrayOutput) ToShardingInstanceShardListArrayOutputWithContext(ctx context.Context) ShardingInstanceShardListArrayOutput {
	return o
}

func (o ShardingInstanceShardListArrayOutput) Index(i pulumi.IntInput) ShardingInstanceShardListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ShardingInstanceShardList {
		return vs[0].([]ShardingInstanceShardList)[vs[1].(int)]
	}).(ShardingInstanceShardListOutput)
}

type GetInstancesInstance struct {
	// Instance availability zone.
	AvailabilityZone string `pulumi:"availabilityZone"`
	// Billing method. Value options are `PostPaid` for  Pay-As-You-Go and `PrePaid` for yearly or monthly subscription.
	ChargeType string `pulumi:"chargeType"`
	// Creation time of the instance in RFC3339 format.
	CreationTime string `pulumi:"creationTime"`
	// Database engine type. Supported option is `MongoDB`.
	Engine string `pulumi:"engine"`
	// Database engine version.
	EngineVersion string `pulumi:"engineVersion"`
	// Expiration time in RFC3339 format. Pay-As-You-Go instances are never expire.
	ExpirationTime string `pulumi:"expirationTime"`
	// The ID of the MongoDB instance.
	Id string `pulumi:"id"`
	// Sizing of the instance to be queried.
	InstanceClass string `pulumi:"instanceClass"`
	// Type of the instance to be queried. If it is set to `sharding`, the sharded cluster instances are listed. If it is set to `replicate`, replica set instances are listed. Default value `replicate`.
	InstanceType string `pulumi:"instanceType"`
	// Lock status of the instance.
	LockMode string `pulumi:"lockMode"`
	// Array composed of Mongos.
	Mongos []GetInstancesInstanceMongo `pulumi:"mongos"`
	// The name of the MongoDB instance.
	Name string `pulumi:"name"`
	// Classic network or VPC.
	NetworkType string `pulumi:"networkType"`
	// Region ID the instance belongs to.
	RegionId string `pulumi:"regionId"`
	// Replication factor corresponds to number of nodes. Optional values are `1` for single node and `3` for three nodes replica set.
	Replication string `pulumi:"replication"`
	// Array composed of shards.
	Shards []GetInstancesInstanceShard `pulumi:"shards"`
	// Status of the instance.
	Status string `pulumi:"status"`
	// Shard disk.
	Storage int `pulumi:"storage"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// GetInstancesInstanceInput is an input type that accepts GetInstancesInstanceArgs and GetInstancesInstanceOutput values.
// You can construct a concrete instance of `GetInstancesInstanceInput` via:
//
//          GetInstancesInstanceArgs{...}
type GetInstancesInstanceInput interface {
	pulumi.Input

	ToGetInstancesInstanceOutput() GetInstancesInstanceOutput
	ToGetInstancesInstanceOutputWithContext(context.Context) GetInstancesInstanceOutput
}

type GetInstancesInstanceArgs struct {
	// Instance availability zone.
	AvailabilityZone pulumi.StringInput `pulumi:"availabilityZone"`
	// Billing method. Value options are `PostPaid` for  Pay-As-You-Go and `PrePaid` for yearly or monthly subscription.
	ChargeType pulumi.StringInput `pulumi:"chargeType"`
	// Creation time of the instance in RFC3339 format.
	CreationTime pulumi.StringInput `pulumi:"creationTime"`
	// Database engine type. Supported option is `MongoDB`.
	Engine pulumi.StringInput `pulumi:"engine"`
	// Database engine version.
	EngineVersion pulumi.StringInput `pulumi:"engineVersion"`
	// Expiration time in RFC3339 format. Pay-As-You-Go instances are never expire.
	ExpirationTime pulumi.StringInput `pulumi:"expirationTime"`
	// The ID of the MongoDB instance.
	Id pulumi.StringInput `pulumi:"id"`
	// Sizing of the instance to be queried.
	InstanceClass pulumi.StringInput `pulumi:"instanceClass"`
	// Type of the instance to be queried. If it is set to `sharding`, the sharded cluster instances are listed. If it is set to `replicate`, replica set instances are listed. Default value `replicate`.
	InstanceType pulumi.StringInput `pulumi:"instanceType"`
	// Lock status of the instance.
	LockMode pulumi.StringInput `pulumi:"lockMode"`
	// Array composed of Mongos.
	Mongos GetInstancesInstanceMongoArrayInput `pulumi:"mongos"`
	// The name of the MongoDB instance.
	Name pulumi.StringInput `pulumi:"name"`
	// Classic network or VPC.
	NetworkType pulumi.StringInput `pulumi:"networkType"`
	// Region ID the instance belongs to.
	RegionId pulumi.StringInput `pulumi:"regionId"`
	// Replication factor corresponds to number of nodes. Optional values are `1` for single node and `3` for three nodes replica set.
	Replication pulumi.StringInput `pulumi:"replication"`
	// Array composed of shards.
	Shards GetInstancesInstanceShardArrayInput `pulumi:"shards"`
	// Status of the instance.
	Status pulumi.StringInput `pulumi:"status"`
	// Shard disk.
	Storage pulumi.IntInput `pulumi:"storage"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (GetInstancesInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return i.ToGetInstancesInstanceOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceOutput)
}

// GetInstancesInstanceArrayInput is an input type that accepts GetInstancesInstanceArray and GetInstancesInstanceArrayOutput values.
// You can construct a concrete instance of `GetInstancesInstanceArrayInput` via:
//
//          GetInstancesInstanceArray{ GetInstancesInstanceArgs{...} }
type GetInstancesInstanceArrayInput interface {
	pulumi.Input

	ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput
	ToGetInstancesInstanceArrayOutputWithContext(context.Context) GetInstancesInstanceArrayOutput
}

type GetInstancesInstanceArray []GetInstancesInstanceInput

func (GetInstancesInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return i.ToGetInstancesInstanceArrayOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceArrayOutput)
}

type GetInstancesInstanceOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return o
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return o
}

// Instance availability zone.
func (o GetInstancesInstanceOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// Billing method. Value options are `PostPaid` for  Pay-As-You-Go and `PrePaid` for yearly or monthly subscription.
func (o GetInstancesInstanceOutput) ChargeType() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.ChargeType }).(pulumi.StringOutput)
}

// Creation time of the instance in RFC3339 format.
func (o GetInstancesInstanceOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.CreationTime }).(pulumi.StringOutput)
}

// Database engine type. Supported option is `MongoDB`.
func (o GetInstancesInstanceOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Engine }).(pulumi.StringOutput)
}

// Database engine version.
func (o GetInstancesInstanceOutput) EngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.EngineVersion }).(pulumi.StringOutput)
}

// Expiration time in RFC3339 format. Pay-As-You-Go instances are never expire.
func (o GetInstancesInstanceOutput) ExpirationTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.ExpirationTime }).(pulumi.StringOutput)
}

// The ID of the MongoDB instance.
func (o GetInstancesInstanceOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Id }).(pulumi.StringOutput)
}

// Sizing of the instance to be queried.
func (o GetInstancesInstanceOutput) InstanceClass() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.InstanceClass }).(pulumi.StringOutput)
}

// Type of the instance to be queried. If it is set to `sharding`, the sharded cluster instances are listed. If it is set to `replicate`, replica set instances are listed. Default value `replicate`.
func (o GetInstancesInstanceOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.InstanceType }).(pulumi.StringOutput)
}

// Lock status of the instance.
func (o GetInstancesInstanceOutput) LockMode() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.LockMode }).(pulumi.StringOutput)
}

// Array composed of Mongos.
func (o GetInstancesInstanceOutput) Mongos() GetInstancesInstanceMongoArrayOutput {
	return o.ApplyT(func(v GetInstancesInstance) []GetInstancesInstanceMongo { return v.Mongos }).(GetInstancesInstanceMongoArrayOutput)
}

// The name of the MongoDB instance.
func (o GetInstancesInstanceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Name }).(pulumi.StringOutput)
}

// Classic network or VPC.
func (o GetInstancesInstanceOutput) NetworkType() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.NetworkType }).(pulumi.StringOutput)
}

// Region ID the instance belongs to.
func (o GetInstancesInstanceOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.RegionId }).(pulumi.StringOutput)
}

// Replication factor corresponds to number of nodes. Optional values are `1` for single node and `3` for three nodes replica set.
func (o GetInstancesInstanceOutput) Replication() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Replication }).(pulumi.StringOutput)
}

// Array composed of shards.
func (o GetInstancesInstanceOutput) Shards() GetInstancesInstanceShardArrayOutput {
	return o.ApplyT(func(v GetInstancesInstance) []GetInstancesInstanceShard { return v.Shards }).(GetInstancesInstanceShardArrayOutput)
}

// Status of the instance.
func (o GetInstancesInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Status }).(pulumi.StringOutput)
}

// Shard disk.
func (o GetInstancesInstanceOutput) Storage() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.Storage }).(pulumi.IntOutput)
}

// A mapping of tags to assign to the resource.
func (o GetInstancesInstanceOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetInstancesInstance) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

type GetInstancesInstanceArrayOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) Index(i pulumi.IntInput) GetInstancesInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetInstancesInstance {
		return vs[0].([]GetInstancesInstance)[vs[1].(int)]
	}).(GetInstancesInstanceOutput)
}

type GetInstancesInstanceMongo struct {
	// Shard instance specification.
	Class string `pulumi:"class"`
	// Shard instance description.
	Description string `pulumi:"description"`
	// Shard instance ID.
	NodeId string `pulumi:"nodeId"`
}

// GetInstancesInstanceMongoInput is an input type that accepts GetInstancesInstanceMongoArgs and GetInstancesInstanceMongoOutput values.
// You can construct a concrete instance of `GetInstancesInstanceMongoInput` via:
//
//          GetInstancesInstanceMongoArgs{...}
type GetInstancesInstanceMongoInput interface {
	pulumi.Input

	ToGetInstancesInstanceMongoOutput() GetInstancesInstanceMongoOutput
	ToGetInstancesInstanceMongoOutputWithContext(context.Context) GetInstancesInstanceMongoOutput
}

type GetInstancesInstanceMongoArgs struct {
	// Shard instance specification.
	Class pulumi.StringInput `pulumi:"class"`
	// Shard instance description.
	Description pulumi.StringInput `pulumi:"description"`
	// Shard instance ID.
	NodeId pulumi.StringInput `pulumi:"nodeId"`
}

func (GetInstancesInstanceMongoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstanceMongo)(nil)).Elem()
}

func (i GetInstancesInstanceMongoArgs) ToGetInstancesInstanceMongoOutput() GetInstancesInstanceMongoOutput {
	return i.ToGetInstancesInstanceMongoOutputWithContext(context.Background())
}

func (i GetInstancesInstanceMongoArgs) ToGetInstancesInstanceMongoOutputWithContext(ctx context.Context) GetInstancesInstanceMongoOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceMongoOutput)
}

// GetInstancesInstanceMongoArrayInput is an input type that accepts GetInstancesInstanceMongoArray and GetInstancesInstanceMongoArrayOutput values.
// You can construct a concrete instance of `GetInstancesInstanceMongoArrayInput` via:
//
//          GetInstancesInstanceMongoArray{ GetInstancesInstanceMongoArgs{...} }
type GetInstancesInstanceMongoArrayInput interface {
	pulumi.Input

	ToGetInstancesInstanceMongoArrayOutput() GetInstancesInstanceMongoArrayOutput
	ToGetInstancesInstanceMongoArrayOutputWithContext(context.Context) GetInstancesInstanceMongoArrayOutput
}

type GetInstancesInstanceMongoArray []GetInstancesInstanceMongoInput

func (GetInstancesInstanceMongoArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstanceMongo)(nil)).Elem()
}

func (i GetInstancesInstanceMongoArray) ToGetInstancesInstanceMongoArrayOutput() GetInstancesInstanceMongoArrayOutput {
	return i.ToGetInstancesInstanceMongoArrayOutputWithContext(context.Background())
}

func (i GetInstancesInstanceMongoArray) ToGetInstancesInstanceMongoArrayOutputWithContext(ctx context.Context) GetInstancesInstanceMongoArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceMongoArrayOutput)
}

type GetInstancesInstanceMongoOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceMongoOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstanceMongo)(nil)).Elem()
}

func (o GetInstancesInstanceMongoOutput) ToGetInstancesInstanceMongoOutput() GetInstancesInstanceMongoOutput {
	return o
}

func (o GetInstancesInstanceMongoOutput) ToGetInstancesInstanceMongoOutputWithContext(ctx context.Context) GetInstancesInstanceMongoOutput {
	return o
}

// Shard instance specification.
func (o GetInstancesInstanceMongoOutput) Class() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstanceMongo) string { return v.Class }).(pulumi.StringOutput)
}

// Shard instance description.
func (o GetInstancesInstanceMongoOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstanceMongo) string { return v.Description }).(pulumi.StringOutput)
}

// Shard instance ID.
func (o GetInstancesInstanceMongoOutput) NodeId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstanceMongo) string { return v.NodeId }).(pulumi.StringOutput)
}

type GetInstancesInstanceMongoArrayOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceMongoArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstanceMongo)(nil)).Elem()
}

func (o GetInstancesInstanceMongoArrayOutput) ToGetInstancesInstanceMongoArrayOutput() GetInstancesInstanceMongoArrayOutput {
	return o
}

func (o GetInstancesInstanceMongoArrayOutput) ToGetInstancesInstanceMongoArrayOutputWithContext(ctx context.Context) GetInstancesInstanceMongoArrayOutput {
	return o
}

func (o GetInstancesInstanceMongoArrayOutput) Index(i pulumi.IntInput) GetInstancesInstanceMongoOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetInstancesInstanceMongo {
		return vs[0].([]GetInstancesInstanceMongo)[vs[1].(int)]
	}).(GetInstancesInstanceMongoOutput)
}

type GetInstancesInstanceShard struct {
	// Shard instance specification.
	Class string `pulumi:"class"`
	// Shard instance description.
	Description string `pulumi:"description"`
	// Shard instance ID.
	NodeId string `pulumi:"nodeId"`
	// Shard disk.
	Storage int `pulumi:"storage"`
}

// GetInstancesInstanceShardInput is an input type that accepts GetInstancesInstanceShardArgs and GetInstancesInstanceShardOutput values.
// You can construct a concrete instance of `GetInstancesInstanceShardInput` via:
//
//          GetInstancesInstanceShardArgs{...}
type GetInstancesInstanceShardInput interface {
	pulumi.Input

	ToGetInstancesInstanceShardOutput() GetInstancesInstanceShardOutput
	ToGetInstancesInstanceShardOutputWithContext(context.Context) GetInstancesInstanceShardOutput
}

type GetInstancesInstanceShardArgs struct {
	// Shard instance specification.
	Class pulumi.StringInput `pulumi:"class"`
	// Shard instance description.
	Description pulumi.StringInput `pulumi:"description"`
	// Shard instance ID.
	NodeId pulumi.StringInput `pulumi:"nodeId"`
	// Shard disk.
	Storage pulumi.IntInput `pulumi:"storage"`
}

func (GetInstancesInstanceShardArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstanceShard)(nil)).Elem()
}

func (i GetInstancesInstanceShardArgs) ToGetInstancesInstanceShardOutput() GetInstancesInstanceShardOutput {
	return i.ToGetInstancesInstanceShardOutputWithContext(context.Background())
}

func (i GetInstancesInstanceShardArgs) ToGetInstancesInstanceShardOutputWithContext(ctx context.Context) GetInstancesInstanceShardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceShardOutput)
}

// GetInstancesInstanceShardArrayInput is an input type that accepts GetInstancesInstanceShardArray and GetInstancesInstanceShardArrayOutput values.
// You can construct a concrete instance of `GetInstancesInstanceShardArrayInput` via:
//
//          GetInstancesInstanceShardArray{ GetInstancesInstanceShardArgs{...} }
type GetInstancesInstanceShardArrayInput interface {
	pulumi.Input

	ToGetInstancesInstanceShardArrayOutput() GetInstancesInstanceShardArrayOutput
	ToGetInstancesInstanceShardArrayOutputWithContext(context.Context) GetInstancesInstanceShardArrayOutput
}

type GetInstancesInstanceShardArray []GetInstancesInstanceShardInput

func (GetInstancesInstanceShardArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstanceShard)(nil)).Elem()
}

func (i GetInstancesInstanceShardArray) ToGetInstancesInstanceShardArrayOutput() GetInstancesInstanceShardArrayOutput {
	return i.ToGetInstancesInstanceShardArrayOutputWithContext(context.Background())
}

func (i GetInstancesInstanceShardArray) ToGetInstancesInstanceShardArrayOutputWithContext(ctx context.Context) GetInstancesInstanceShardArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceShardArrayOutput)
}

type GetInstancesInstanceShardOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceShardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstanceShard)(nil)).Elem()
}

func (o GetInstancesInstanceShardOutput) ToGetInstancesInstanceShardOutput() GetInstancesInstanceShardOutput {
	return o
}

func (o GetInstancesInstanceShardOutput) ToGetInstancesInstanceShardOutputWithContext(ctx context.Context) GetInstancesInstanceShardOutput {
	return o
}

// Shard instance specification.
func (o GetInstancesInstanceShardOutput) Class() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstanceShard) string { return v.Class }).(pulumi.StringOutput)
}

// Shard instance description.
func (o GetInstancesInstanceShardOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstanceShard) string { return v.Description }).(pulumi.StringOutput)
}

// Shard instance ID.
func (o GetInstancesInstanceShardOutput) NodeId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstanceShard) string { return v.NodeId }).(pulumi.StringOutput)
}

// Shard disk.
func (o GetInstancesInstanceShardOutput) Storage() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstanceShard) int { return v.Storage }).(pulumi.IntOutput)
}

type GetInstancesInstanceShardArrayOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceShardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstanceShard)(nil)).Elem()
}

func (o GetInstancesInstanceShardArrayOutput) ToGetInstancesInstanceShardArrayOutput() GetInstancesInstanceShardArrayOutput {
	return o
}

func (o GetInstancesInstanceShardArrayOutput) ToGetInstancesInstanceShardArrayOutputWithContext(ctx context.Context) GetInstancesInstanceShardArrayOutput {
	return o
}

func (o GetInstancesInstanceShardArrayOutput) Index(i pulumi.IntInput) GetInstancesInstanceShardOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetInstancesInstanceShard {
		return vs[0].([]GetInstancesInstanceShard)[vs[1].(int)]
	}).(GetInstancesInstanceShardOutput)
}

type GetZonesZone struct {
	// ID of the zone.
	Id string `pulumi:"id"`
	// A list of zone ids in which the multi zone.
	MultiZoneIds []string `pulumi:"multiZoneIds"`
}

// GetZonesZoneInput is an input type that accepts GetZonesZoneArgs and GetZonesZoneOutput values.
// You can construct a concrete instance of `GetZonesZoneInput` via:
//
//          GetZonesZoneArgs{...}
type GetZonesZoneInput interface {
	pulumi.Input

	ToGetZonesZoneOutput() GetZonesZoneOutput
	ToGetZonesZoneOutputWithContext(context.Context) GetZonesZoneOutput
}

type GetZonesZoneArgs struct {
	// ID of the zone.
	Id pulumi.StringInput `pulumi:"id"`
	// A list of zone ids in which the multi zone.
	MultiZoneIds pulumi.StringArrayInput `pulumi:"multiZoneIds"`
}

func (GetZonesZoneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesZone)(nil)).Elem()
}

func (i GetZonesZoneArgs) ToGetZonesZoneOutput() GetZonesZoneOutput {
	return i.ToGetZonesZoneOutputWithContext(context.Background())
}

func (i GetZonesZoneArgs) ToGetZonesZoneOutputWithContext(ctx context.Context) GetZonesZoneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZonesZoneOutput)
}

// GetZonesZoneArrayInput is an input type that accepts GetZonesZoneArray and GetZonesZoneArrayOutput values.
// You can construct a concrete instance of `GetZonesZoneArrayInput` via:
//
//          GetZonesZoneArray{ GetZonesZoneArgs{...} }
type GetZonesZoneArrayInput interface {
	pulumi.Input

	ToGetZonesZoneArrayOutput() GetZonesZoneArrayOutput
	ToGetZonesZoneArrayOutputWithContext(context.Context) GetZonesZoneArrayOutput
}

type GetZonesZoneArray []GetZonesZoneInput

func (GetZonesZoneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZonesZone)(nil)).Elem()
}

func (i GetZonesZoneArray) ToGetZonesZoneArrayOutput() GetZonesZoneArrayOutput {
	return i.ToGetZonesZoneArrayOutputWithContext(context.Background())
}

func (i GetZonesZoneArray) ToGetZonesZoneArrayOutputWithContext(ctx context.Context) GetZonesZoneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZonesZoneArrayOutput)
}

type GetZonesZoneOutput struct{ *pulumi.OutputState }

func (GetZonesZoneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesZone)(nil)).Elem()
}

func (o GetZonesZoneOutput) ToGetZonesZoneOutput() GetZonesZoneOutput {
	return o
}

func (o GetZonesZoneOutput) ToGetZonesZoneOutputWithContext(ctx context.Context) GetZonesZoneOutput {
	return o
}

// ID of the zone.
func (o GetZonesZoneOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.Id }).(pulumi.StringOutput)
}

// A list of zone ids in which the multi zone.
func (o GetZonesZoneOutput) MultiZoneIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesZone) []string { return v.MultiZoneIds }).(pulumi.StringArrayOutput)
}

type GetZonesZoneArrayOutput struct{ *pulumi.OutputState }

func (GetZonesZoneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZonesZone)(nil)).Elem()
}

func (o GetZonesZoneArrayOutput) ToGetZonesZoneArrayOutput() GetZonesZoneArrayOutput {
	return o
}

func (o GetZonesZoneArrayOutput) ToGetZonesZoneArrayOutputWithContext(ctx context.Context) GetZonesZoneArrayOutput {
	return o
}

func (o GetZonesZoneArrayOutput) Index(i pulumi.IntInput) GetZonesZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetZonesZone {
		return vs[0].([]GetZonesZone)[vs[1].(int)]
	}).(GetZonesZoneOutput)
}

func init() {
	pulumi.RegisterOutputType(ShardingInstanceMongoListOutput{})
	pulumi.RegisterOutputType(ShardingInstanceMongoListArrayOutput{})
	pulumi.RegisterOutputType(ShardingInstanceShardListOutput{})
	pulumi.RegisterOutputType(ShardingInstanceShardListArrayOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceArrayOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceMongoOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceMongoArrayOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceShardOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceShardArrayOutput{})
	pulumi.RegisterOutputType(GetZonesZoneOutput{})
	pulumi.RegisterOutputType(GetZonesZoneArrayOutput{})
}
