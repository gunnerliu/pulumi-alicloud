// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package graphdatabase

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Graph Database Db Instance resource.
//
// For information about Graph Database Db Instance and how to use it, see [What is Db Instance](https://help.aliyun.com/document_detail/102865.html).
//
// > **NOTE:** Available in v1.136.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/graphdatabase"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := graphdatabase.NewDbInstance(ctx, "example", &graphdatabase.DbInstanceArgs{
// 			DbInstanceCategory:    pulumi.String("HA"),
// 			DbInstanceDescription: pulumi.String("example_value"),
// 			DbInstanceNetworkType: pulumi.String("vpc"),
// 			DbInstanceStorageType: pulumi.String("cloud_ssd"),
// 			DbNodeClass:           pulumi.String("gdb.r.2xlarge"),
// 			DbNodeStorage:         pulumi.Int("example_value"),
// 			DbVersion:             pulumi.String("1.0"),
// 			PaymentType:           pulumi.String("PayAsYouGo"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Graph Database Db Instance can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:graphdatabase/dbInstance:DbInstance example <id>
// ```
type DbInstance struct {
	pulumi.CustomResourceState

	// The category of the db instance. Valid values: `HA`.
	DbInstanceCategory pulumi.StringOutput `pulumi:"dbInstanceCategory"`
	// According to the practical example or notes.
	DbInstanceDescription pulumi.StringPtrOutput `pulumi:"dbInstanceDescription"`
	// IP ADDRESS whitelist for the instance group list. See the following `Block dbInstanceIpArray`.
	DbInstanceIpArrays DbInstanceDbInstanceIpArrayArrayOutput `pulumi:"dbInstanceIpArrays"`
	// The network type of the db instance. Valid values: `vpc`.
	DbInstanceNetworkType pulumi.StringOutput `pulumi:"dbInstanceNetworkType"`
	// Disk storage type. Valid values: `cloudEssd`, `cloudSsd`. Modification is not supported.
	DbInstanceStorageType pulumi.StringOutput `pulumi:"dbInstanceStorageType"`
	// The class of the db node. Valid values: `gdb.r.xlarge`, `gdb.r.2xlarge`, `gdb.r.4xlarge`, `gdb.r.8xlarge`, `gdb.r.16xlarge`.
	DbNodeClass pulumi.StringOutput `pulumi:"dbNodeClass"`
	// Instance storage space, which is measured in GB.
	DbNodeStorage pulumi.IntOutput `pulumi:"dbNodeStorage"`
	// Kernel Version. Valid values: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
	DbVersion pulumi.StringOutput `pulumi:"dbVersion"`
	// The paymen type of the resource. Valid values: `PayAsYouGo`.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
	Status pulumi.StringOutput `pulumi:"status"`
	// ID of the VPC.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The ID of attaching vswitch to instance.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The zone ID of the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewDbInstance registers a new resource with the given unique name, arguments, and options.
func NewDbInstance(ctx *pulumi.Context,
	name string, args *DbInstanceArgs, opts ...pulumi.ResourceOption) (*DbInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DbInstanceCategory == nil {
		return nil, errors.New("invalid value for required argument 'DbInstanceCategory'")
	}
	if args.DbInstanceNetworkType == nil {
		return nil, errors.New("invalid value for required argument 'DbInstanceNetworkType'")
	}
	if args.DbInstanceStorageType == nil {
		return nil, errors.New("invalid value for required argument 'DbInstanceStorageType'")
	}
	if args.DbNodeClass == nil {
		return nil, errors.New("invalid value for required argument 'DbNodeClass'")
	}
	if args.DbNodeStorage == nil {
		return nil, errors.New("invalid value for required argument 'DbNodeStorage'")
	}
	if args.DbVersion == nil {
		return nil, errors.New("invalid value for required argument 'DbVersion'")
	}
	if args.PaymentType == nil {
		return nil, errors.New("invalid value for required argument 'PaymentType'")
	}
	var resource DbInstance
	err := ctx.RegisterResource("alicloud:graphdatabase/dbInstance:DbInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDbInstance gets an existing DbInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDbInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DbInstanceState, opts ...pulumi.ResourceOption) (*DbInstance, error) {
	var resource DbInstance
	err := ctx.ReadResource("alicloud:graphdatabase/dbInstance:DbInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DbInstance resources.
type dbInstanceState struct {
	// The category of the db instance. Valid values: `HA`.
	DbInstanceCategory *string `pulumi:"dbInstanceCategory"`
	// According to the practical example or notes.
	DbInstanceDescription *string `pulumi:"dbInstanceDescription"`
	// IP ADDRESS whitelist for the instance group list. See the following `Block dbInstanceIpArray`.
	DbInstanceIpArrays []DbInstanceDbInstanceIpArray `pulumi:"dbInstanceIpArrays"`
	// The network type of the db instance. Valid values: `vpc`.
	DbInstanceNetworkType *string `pulumi:"dbInstanceNetworkType"`
	// Disk storage type. Valid values: `cloudEssd`, `cloudSsd`. Modification is not supported.
	DbInstanceStorageType *string `pulumi:"dbInstanceStorageType"`
	// The class of the db node. Valid values: `gdb.r.xlarge`, `gdb.r.2xlarge`, `gdb.r.4xlarge`, `gdb.r.8xlarge`, `gdb.r.16xlarge`.
	DbNodeClass *string `pulumi:"dbNodeClass"`
	// Instance storage space, which is measured in GB.
	DbNodeStorage *int `pulumi:"dbNodeStorage"`
	// Kernel Version. Valid values: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
	DbVersion *string `pulumi:"dbVersion"`
	// The paymen type of the resource. Valid values: `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
	Status *string `pulumi:"status"`
	// ID of the VPC.
	VpcId *string `pulumi:"vpcId"`
	// The ID of attaching vswitch to instance.
	VswitchId *string `pulumi:"vswitchId"`
	// The zone ID of the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type DbInstanceState struct {
	// The category of the db instance. Valid values: `HA`.
	DbInstanceCategory pulumi.StringPtrInput
	// According to the practical example or notes.
	DbInstanceDescription pulumi.StringPtrInput
	// IP ADDRESS whitelist for the instance group list. See the following `Block dbInstanceIpArray`.
	DbInstanceIpArrays DbInstanceDbInstanceIpArrayArrayInput
	// The network type of the db instance. Valid values: `vpc`.
	DbInstanceNetworkType pulumi.StringPtrInput
	// Disk storage type. Valid values: `cloudEssd`, `cloudSsd`. Modification is not supported.
	DbInstanceStorageType pulumi.StringPtrInput
	// The class of the db node. Valid values: `gdb.r.xlarge`, `gdb.r.2xlarge`, `gdb.r.4xlarge`, `gdb.r.8xlarge`, `gdb.r.16xlarge`.
	DbNodeClass pulumi.StringPtrInput
	// Instance storage space, which is measured in GB.
	DbNodeStorage pulumi.IntPtrInput
	// Kernel Version. Valid values: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
	DbVersion pulumi.StringPtrInput
	// The paymen type of the resource. Valid values: `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
	Status pulumi.StringPtrInput
	// ID of the VPC.
	VpcId pulumi.StringPtrInput
	// The ID of attaching vswitch to instance.
	VswitchId pulumi.StringPtrInput
	// The zone ID of the resource.
	ZoneId pulumi.StringPtrInput
}

func (DbInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*dbInstanceState)(nil)).Elem()
}

type dbInstanceArgs struct {
	// The category of the db instance. Valid values: `HA`.
	DbInstanceCategory string `pulumi:"dbInstanceCategory"`
	// According to the practical example or notes.
	DbInstanceDescription *string `pulumi:"dbInstanceDescription"`
	// IP ADDRESS whitelist for the instance group list. See the following `Block dbInstanceIpArray`.
	DbInstanceIpArrays []DbInstanceDbInstanceIpArray `pulumi:"dbInstanceIpArrays"`
	// The network type of the db instance. Valid values: `vpc`.
	DbInstanceNetworkType string `pulumi:"dbInstanceNetworkType"`
	// Disk storage type. Valid values: `cloudEssd`, `cloudSsd`. Modification is not supported.
	DbInstanceStorageType string `pulumi:"dbInstanceStorageType"`
	// The class of the db node. Valid values: `gdb.r.xlarge`, `gdb.r.2xlarge`, `gdb.r.4xlarge`, `gdb.r.8xlarge`, `gdb.r.16xlarge`.
	DbNodeClass string `pulumi:"dbNodeClass"`
	// Instance storage space, which is measured in GB.
	DbNodeStorage int `pulumi:"dbNodeStorage"`
	// Kernel Version. Valid values: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
	DbVersion string `pulumi:"dbVersion"`
	// The paymen type of the resource. Valid values: `PayAsYouGo`.
	PaymentType string `pulumi:"paymentType"`
	// ID of the VPC.
	VpcId *string `pulumi:"vpcId"`
	// The ID of attaching vswitch to instance.
	VswitchId *string `pulumi:"vswitchId"`
	// The zone ID of the resource.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a DbInstance resource.
type DbInstanceArgs struct {
	// The category of the db instance. Valid values: `HA`.
	DbInstanceCategory pulumi.StringInput
	// According to the practical example or notes.
	DbInstanceDescription pulumi.StringPtrInput
	// IP ADDRESS whitelist for the instance group list. See the following `Block dbInstanceIpArray`.
	DbInstanceIpArrays DbInstanceDbInstanceIpArrayArrayInput
	// The network type of the db instance. Valid values: `vpc`.
	DbInstanceNetworkType pulumi.StringInput
	// Disk storage type. Valid values: `cloudEssd`, `cloudSsd`. Modification is not supported.
	DbInstanceStorageType pulumi.StringInput
	// The class of the db node. Valid values: `gdb.r.xlarge`, `gdb.r.2xlarge`, `gdb.r.4xlarge`, `gdb.r.8xlarge`, `gdb.r.16xlarge`.
	DbNodeClass pulumi.StringInput
	// Instance storage space, which is measured in GB.
	DbNodeStorage pulumi.IntInput
	// Kernel Version. Valid values: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
	DbVersion pulumi.StringInput
	// The paymen type of the resource. Valid values: `PayAsYouGo`.
	PaymentType pulumi.StringInput
	// ID of the VPC.
	VpcId pulumi.StringPtrInput
	// The ID of attaching vswitch to instance.
	VswitchId pulumi.StringPtrInput
	// The zone ID of the resource.
	ZoneId pulumi.StringPtrInput
}

func (DbInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dbInstanceArgs)(nil)).Elem()
}

type DbInstanceInput interface {
	pulumi.Input

	ToDbInstanceOutput() DbInstanceOutput
	ToDbInstanceOutputWithContext(ctx context.Context) DbInstanceOutput
}

func (*DbInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**DbInstance)(nil)).Elem()
}

func (i *DbInstance) ToDbInstanceOutput() DbInstanceOutput {
	return i.ToDbInstanceOutputWithContext(context.Background())
}

func (i *DbInstance) ToDbInstanceOutputWithContext(ctx context.Context) DbInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceOutput)
}

// DbInstanceArrayInput is an input type that accepts DbInstanceArray and DbInstanceArrayOutput values.
// You can construct a concrete instance of `DbInstanceArrayInput` via:
//
//          DbInstanceArray{ DbInstanceArgs{...} }
type DbInstanceArrayInput interface {
	pulumi.Input

	ToDbInstanceArrayOutput() DbInstanceArrayOutput
	ToDbInstanceArrayOutputWithContext(context.Context) DbInstanceArrayOutput
}

type DbInstanceArray []DbInstanceInput

func (DbInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DbInstance)(nil)).Elem()
}

func (i DbInstanceArray) ToDbInstanceArrayOutput() DbInstanceArrayOutput {
	return i.ToDbInstanceArrayOutputWithContext(context.Background())
}

func (i DbInstanceArray) ToDbInstanceArrayOutputWithContext(ctx context.Context) DbInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceArrayOutput)
}

// DbInstanceMapInput is an input type that accepts DbInstanceMap and DbInstanceMapOutput values.
// You can construct a concrete instance of `DbInstanceMapInput` via:
//
//          DbInstanceMap{ "key": DbInstanceArgs{...} }
type DbInstanceMapInput interface {
	pulumi.Input

	ToDbInstanceMapOutput() DbInstanceMapOutput
	ToDbInstanceMapOutputWithContext(context.Context) DbInstanceMapOutput
}

type DbInstanceMap map[string]DbInstanceInput

func (DbInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DbInstance)(nil)).Elem()
}

func (i DbInstanceMap) ToDbInstanceMapOutput() DbInstanceMapOutput {
	return i.ToDbInstanceMapOutputWithContext(context.Background())
}

func (i DbInstanceMap) ToDbInstanceMapOutputWithContext(ctx context.Context) DbInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceMapOutput)
}

type DbInstanceOutput struct{ *pulumi.OutputState }

func (DbInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DbInstance)(nil)).Elem()
}

func (o DbInstanceOutput) ToDbInstanceOutput() DbInstanceOutput {
	return o
}

func (o DbInstanceOutput) ToDbInstanceOutputWithContext(ctx context.Context) DbInstanceOutput {
	return o
}

type DbInstanceArrayOutput struct{ *pulumi.OutputState }

func (DbInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DbInstance)(nil)).Elem()
}

func (o DbInstanceArrayOutput) ToDbInstanceArrayOutput() DbInstanceArrayOutput {
	return o
}

func (o DbInstanceArrayOutput) ToDbInstanceArrayOutputWithContext(ctx context.Context) DbInstanceArrayOutput {
	return o
}

func (o DbInstanceArrayOutput) Index(i pulumi.IntInput) DbInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DbInstance {
		return vs[0].([]*DbInstance)[vs[1].(int)]
	}).(DbInstanceOutput)
}

type DbInstanceMapOutput struct{ *pulumi.OutputState }

func (DbInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DbInstance)(nil)).Elem()
}

func (o DbInstanceMapOutput) ToDbInstanceMapOutput() DbInstanceMapOutput {
	return o
}

func (o DbInstanceMapOutput) ToDbInstanceMapOutputWithContext(ctx context.Context) DbInstanceMapOutput {
	return o
}

func (o DbInstanceMapOutput) MapIndex(k pulumi.StringInput) DbInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DbInstance {
		return vs[0].(map[string]*DbInstance)[vs[1].(string)]
	}).(DbInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceInput)(nil)).Elem(), &DbInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceArrayInput)(nil)).Elem(), DbInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceMapInput)(nil)).Elem(), DbInstanceMap{})
	pulumi.RegisterOutputType(DbInstanceOutput{})
	pulumi.RegisterOutputType(DbInstanceArrayOutput{})
	pulumi.RegisterOutputType(DbInstanceMapOutput{})
}
