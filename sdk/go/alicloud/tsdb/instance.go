// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package tsdb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Time Series Database (TSDB) Instance resource.
//
// For information about Time Series Database (TSDB) Instance and how to use it, see [What is Time Series Database (TSDB)](https://www.alibabacloud.com/help/en/doc-detail/55652.htm).
//
// > **NOTE:** Available in v1.112.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/tsdb"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleZones, err := tsdb.GetZones(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleNetwork, err := vpc.NewNetwork(ctx, "exampleNetwork", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("192.168.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleSwitch, err := vpc.NewSwitch(ctx, "exampleSwitch", &vpc.SwitchArgs{
// 			AvailabilityZone: pulumi.String(exampleZones.Ids[0]),
// 			CidrBlock:        pulumi.String("192.168.1.0/24"),
// 			VpcId:            exampleNetwork.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = tsdb.NewInstance(ctx, "exampleInstance", &tsdb.InstanceArgs{
// 			PaymentType:     pulumi.String("PayAsYouGo"),
// 			VswitchId:       exampleSwitch.ID(),
// 			InstanceStorage: pulumi.String("50"),
// 			InstanceClass:   pulumi.String("tsdb.1x.basic"),
// 			EngineType:      pulumi.String("tsdb_tsdb"),
// 			InstanceAlias:   pulumi.String("tf-testaccTsdbInstance"),
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
// TSDB Instance can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:tsdb/instance:Instance example <id>
// ```
type Instance struct {
	pulumi.CustomResourceState

	// The app key.
	AppKey pulumi.StringPtrOutput `pulumi:"appKey"`
	// The disk type of instance. Valid when the engine type is `tsdbInfluxdb`. `cloudSsd` refers to SSD disk, `cloudEfficiency` refers to efficiency disk, `cloudEssd` refers to ESSD PL1 disk. Valid values: `cloudEfficiency`, `cloudEssd`, `cloudSsd`.
	DiskCategory pulumi.StringPtrOutput `pulumi:"diskCategory"`
	// The duration.
	Duration pulumi.StringPtrOutput `pulumi:"duration"`
	// The engine type of instance Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
	EngineType pulumi.StringPtrOutput `pulumi:"engineType"`
	// The alias of the instance.
	InstanceAlias pulumi.StringPtrOutput `pulumi:"instanceAlias"`
	// The specification of the instance.
	// - Following enumerative value for TSDB for InfluxDB️ standart edition:
	// - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB for InfluxDB High-availability edition:
	// - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB:
	// - `tsdb.1x.basic` refers to basic edition I;
	// - `tsdb.3x.basic` refers to basic edition II;
	// - `tsdb.4x.basic` refers to basic edtion III;
	// - `tsdb.12x.standard` refers to standard edition I;
	// - `tsdb.24x.standard` refers to standard edition II;
	// - `tsdb.48x.large` refers to ultimate edition I;
	// - `tsdb.96x.large` refers to ultimate edition II.
	InstanceClass pulumi.StringOutput `pulumi:"instanceClass"`
	// The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
	InstanceStorage pulumi.StringOutput `pulumi:"instanceStorage"`
	// The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// Instance status, enumerative: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`.
	Status pulumi.StringOutput `pulumi:"status"`
	// The vswitch id.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The zone ID of the instance.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOption) (*Instance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceClass == nil {
		return nil, errors.New("invalid value for required argument 'InstanceClass'")
	}
	if args.InstanceStorage == nil {
		return nil, errors.New("invalid value for required argument 'InstanceStorage'")
	}
	if args.PaymentType == nil {
		return nil, errors.New("invalid value for required argument 'PaymentType'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	var resource Instance
	err := ctx.RegisterResource("alicloud:tsdb/instance:Instance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceState, opts ...pulumi.ResourceOption) (*Instance, error) {
	var resource Instance
	err := ctx.ReadResource("alicloud:tsdb/instance:Instance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Instance resources.
type instanceState struct {
	// The app key.
	AppKey *string `pulumi:"appKey"`
	// The disk type of instance. Valid when the engine type is `tsdbInfluxdb`. `cloudSsd` refers to SSD disk, `cloudEfficiency` refers to efficiency disk, `cloudEssd` refers to ESSD PL1 disk. Valid values: `cloudEfficiency`, `cloudEssd`, `cloudSsd`.
	DiskCategory *string `pulumi:"diskCategory"`
	// The duration.
	Duration *string `pulumi:"duration"`
	// The engine type of instance Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
	EngineType *string `pulumi:"engineType"`
	// The alias of the instance.
	InstanceAlias *string `pulumi:"instanceAlias"`
	// The specification of the instance.
	// - Following enumerative value for TSDB for InfluxDB️ standart edition:
	// - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB for InfluxDB High-availability edition:
	// - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB:
	// - `tsdb.1x.basic` refers to basic edition I;
	// - `tsdb.3x.basic` refers to basic edition II;
	// - `tsdb.4x.basic` refers to basic edtion III;
	// - `tsdb.12x.standard` refers to standard edition I;
	// - `tsdb.24x.standard` refers to standard edition II;
	// - `tsdb.48x.large` refers to ultimate edition I;
	// - `tsdb.96x.large` refers to ultimate edition II.
	InstanceClass *string `pulumi:"instanceClass"`
	// The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
	InstanceStorage *string `pulumi:"instanceStorage"`
	// The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
	PaymentType *string `pulumi:"paymentType"`
	// Instance status, enumerative: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`.
	Status *string `pulumi:"status"`
	// The vswitch id.
	VswitchId *string `pulumi:"vswitchId"`
	// The zone ID of the instance.
	ZoneId *string `pulumi:"zoneId"`
}

type InstanceState struct {
	// The app key.
	AppKey pulumi.StringPtrInput
	// The disk type of instance. Valid when the engine type is `tsdbInfluxdb`. `cloudSsd` refers to SSD disk, `cloudEfficiency` refers to efficiency disk, `cloudEssd` refers to ESSD PL1 disk. Valid values: `cloudEfficiency`, `cloudEssd`, `cloudSsd`.
	DiskCategory pulumi.StringPtrInput
	// The duration.
	Duration pulumi.StringPtrInput
	// The engine type of instance Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
	EngineType pulumi.StringPtrInput
	// The alias of the instance.
	InstanceAlias pulumi.StringPtrInput
	// The specification of the instance.
	// - Following enumerative value for TSDB for InfluxDB️ standart edition:
	// - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB for InfluxDB High-availability edition:
	// - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB:
	// - `tsdb.1x.basic` refers to basic edition I;
	// - `tsdb.3x.basic` refers to basic edition II;
	// - `tsdb.4x.basic` refers to basic edtion III;
	// - `tsdb.12x.standard` refers to standard edition I;
	// - `tsdb.24x.standard` refers to standard edition II;
	// - `tsdb.48x.large` refers to ultimate edition I;
	// - `tsdb.96x.large` refers to ultimate edition II.
	InstanceClass pulumi.StringPtrInput
	// The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
	InstanceStorage pulumi.StringPtrInput
	// The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
	PaymentType pulumi.StringPtrInput
	// Instance status, enumerative: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`.
	Status pulumi.StringPtrInput
	// The vswitch id.
	VswitchId pulumi.StringPtrInput
	// The zone ID of the instance.
	ZoneId pulumi.StringPtrInput
}

func (InstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceState)(nil)).Elem()
}

type instanceArgs struct {
	// The app key.
	AppKey *string `pulumi:"appKey"`
	// The disk type of instance. Valid when the engine type is `tsdbInfluxdb`. `cloudSsd` refers to SSD disk, `cloudEfficiency` refers to efficiency disk, `cloudEssd` refers to ESSD PL1 disk. Valid values: `cloudEfficiency`, `cloudEssd`, `cloudSsd`.
	DiskCategory *string `pulumi:"diskCategory"`
	// The duration.
	Duration *string `pulumi:"duration"`
	// The engine type of instance Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
	EngineType *string `pulumi:"engineType"`
	// The alias of the instance.
	InstanceAlias *string `pulumi:"instanceAlias"`
	// The specification of the instance.
	// - Following enumerative value for TSDB for InfluxDB️ standart edition:
	// - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB for InfluxDB High-availability edition:
	// - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB:
	// - `tsdb.1x.basic` refers to basic edition I;
	// - `tsdb.3x.basic` refers to basic edition II;
	// - `tsdb.4x.basic` refers to basic edtion III;
	// - `tsdb.12x.standard` refers to standard edition I;
	// - `tsdb.24x.standard` refers to standard edition II;
	// - `tsdb.48x.large` refers to ultimate edition I;
	// - `tsdb.96x.large` refers to ultimate edition II.
	InstanceClass string `pulumi:"instanceClass"`
	// The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
	InstanceStorage string `pulumi:"instanceStorage"`
	// The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
	PaymentType string `pulumi:"paymentType"`
	// The vswitch id.
	VswitchId string `pulumi:"vswitchId"`
	// The zone ID of the instance.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// The app key.
	AppKey pulumi.StringPtrInput
	// The disk type of instance. Valid when the engine type is `tsdbInfluxdb`. `cloudSsd` refers to SSD disk, `cloudEfficiency` refers to efficiency disk, `cloudEssd` refers to ESSD PL1 disk. Valid values: `cloudEfficiency`, `cloudEssd`, `cloudSsd`.
	DiskCategory pulumi.StringPtrInput
	// The duration.
	Duration pulumi.StringPtrInput
	// The engine type of instance Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
	EngineType pulumi.StringPtrInput
	// The alias of the instance.
	InstanceAlias pulumi.StringPtrInput
	// The specification of the instance.
	// - Following enumerative value for TSDB for InfluxDB️ standart edition:
	// - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB for InfluxDB High-availability edition:
	// - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
	// - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
	// - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
	// - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
	// - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
	// - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
	// - Following enumerative value for TSDB:
	// - `tsdb.1x.basic` refers to basic edition I;
	// - `tsdb.3x.basic` refers to basic edition II;
	// - `tsdb.4x.basic` refers to basic edtion III;
	// - `tsdb.12x.standard` refers to standard edition I;
	// - `tsdb.24x.standard` refers to standard edition II;
	// - `tsdb.48x.large` refers to ultimate edition I;
	// - `tsdb.96x.large` refers to ultimate edition II.
	InstanceClass pulumi.StringInput
	// The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
	InstanceStorage pulumi.StringInput
	// The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
	PaymentType pulumi.StringInput
	// The vswitch id.
	VswitchId pulumi.StringInput
	// The zone ID of the instance.
	ZoneId pulumi.StringPtrInput
}

func (InstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceArgs)(nil)).Elem()
}

type InstanceInput interface {
	pulumi.Input

	ToInstanceOutput() InstanceOutput
	ToInstanceOutputWithContext(ctx context.Context) InstanceOutput
}

func (*Instance) ElementType() reflect.Type {
	return reflect.TypeOf((*Instance)(nil))
}

func (i *Instance) ToInstanceOutput() InstanceOutput {
	return i.ToInstanceOutputWithContext(context.Background())
}

func (i *Instance) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceOutput)
}

func (i *Instance) ToInstancePtrOutput() InstancePtrOutput {
	return i.ToInstancePtrOutputWithContext(context.Background())
}

func (i *Instance) ToInstancePtrOutputWithContext(ctx context.Context) InstancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstancePtrOutput)
}

type InstancePtrInput interface {
	pulumi.Input

	ToInstancePtrOutput() InstancePtrOutput
	ToInstancePtrOutputWithContext(ctx context.Context) InstancePtrOutput
}

type instancePtrType InstanceArgs

func (*instancePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil))
}

func (i *instancePtrType) ToInstancePtrOutput() InstancePtrOutput {
	return i.ToInstancePtrOutputWithContext(context.Background())
}

func (i *instancePtrType) ToInstancePtrOutputWithContext(ctx context.Context) InstancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstancePtrOutput)
}

// InstanceArrayInput is an input type that accepts InstanceArray and InstanceArrayOutput values.
// You can construct a concrete instance of `InstanceArrayInput` via:
//
//          InstanceArray{ InstanceArgs{...} }
type InstanceArrayInput interface {
	pulumi.Input

	ToInstanceArrayOutput() InstanceArrayOutput
	ToInstanceArrayOutputWithContext(context.Context) InstanceArrayOutput
}

type InstanceArray []InstanceInput

func (InstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Instance)(nil))
}

func (i InstanceArray) ToInstanceArrayOutput() InstanceArrayOutput {
	return i.ToInstanceArrayOutputWithContext(context.Background())
}

func (i InstanceArray) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceArrayOutput)
}

// InstanceMapInput is an input type that accepts InstanceMap and InstanceMapOutput values.
// You can construct a concrete instance of `InstanceMapInput` via:
//
//          InstanceMap{ "key": InstanceArgs{...} }
type InstanceMapInput interface {
	pulumi.Input

	ToInstanceMapOutput() InstanceMapOutput
	ToInstanceMapOutputWithContext(context.Context) InstanceMapOutput
}

type InstanceMap map[string]InstanceInput

func (InstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Instance)(nil))
}

func (i InstanceMap) ToInstanceMapOutput() InstanceMapOutput {
	return i.ToInstanceMapOutputWithContext(context.Background())
}

func (i InstanceMap) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceMapOutput)
}

type InstanceOutput struct {
	*pulumi.OutputState
}

func (InstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Instance)(nil))
}

func (o InstanceOutput) ToInstanceOutput() InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstancePtrOutput() InstancePtrOutput {
	return o.ToInstancePtrOutputWithContext(context.Background())
}

func (o InstanceOutput) ToInstancePtrOutputWithContext(ctx context.Context) InstancePtrOutput {
	return o.ApplyT(func(v Instance) *Instance {
		return &v
	}).(InstancePtrOutput)
}

type InstancePtrOutput struct {
	*pulumi.OutputState
}

func (InstancePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil))
}

func (o InstancePtrOutput) ToInstancePtrOutput() InstancePtrOutput {
	return o
}

func (o InstancePtrOutput) ToInstancePtrOutputWithContext(ctx context.Context) InstancePtrOutput {
	return o
}

type InstanceArrayOutput struct{ *pulumi.OutputState }

func (InstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Instance)(nil))
}

func (o InstanceArrayOutput) ToInstanceArrayOutput() InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) Index(i pulumi.IntInput) InstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Instance {
		return vs[0].([]Instance)[vs[1].(int)]
	}).(InstanceOutput)
}

type InstanceMapOutput struct{ *pulumi.OutputState }

func (InstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Instance)(nil))
}

func (o InstanceMapOutput) ToInstanceMapOutput() InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) MapIndex(k pulumi.StringInput) InstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Instance {
		return vs[0].(map[string]Instance)[vs[1].(string)]
	}).(InstanceOutput)
}

func init() {
	pulumi.RegisterOutputType(InstanceOutput{})
	pulumi.RegisterOutputType(InstancePtrOutput{})
	pulumi.RegisterOutputType(InstanceArrayOutput{})
	pulumi.RegisterOutputType(InstanceMapOutput{})
}
