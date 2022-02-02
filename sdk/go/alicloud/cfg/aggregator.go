// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cfg

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Config Aggregator resource.
//
// For information about Cloud Config Aggregate Config Rule and how to use it, see [What is Aggregator](https://www.alibabacloud.com/help/en/doc-detail/211197.html).
//
// > **NOTE:** Available in v1.124.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cfg"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cfg.NewAggregator(ctx, "example", &cfg.AggregatorArgs{
// 			AggregatorAccounts: cfg.AggregatorAggregatorAccountArray{
// 				&cfg.AggregatorAggregatorAccountArgs{
// 					AccountId:   pulumi.String("123968452689****"),
// 					AccountName: pulumi.String("tf-testacc1234"),
// 					AccountType: pulumi.String("ResourceDirectory"),
// 				},
// 			},
// 			AggregatorName: pulumi.String("tf-testaccConfigAggregator1234"),
// 			Description:    pulumi.String("tf-testaccConfigAggregator1234"),
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
// Cloud Config Aggregator can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cfg/aggregator:Aggregator example <id>
// ```
type Aggregator struct {
	pulumi.CustomResourceState

	// The information of account in aggregator. If the aggregatorType is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregatorAccounts` is not required from version 1.148.0.
	AggregatorAccounts AggregatorAggregatorAccountArrayOutput `pulumi:"aggregatorAccounts"`
	// The name of aggregator.
	AggregatorName pulumi.StringOutput `pulumi:"aggregatorName"`
	// The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
	AggregatorType pulumi.StringOutput `pulumi:"aggregatorType"`
	// The description of aggregator.
	Description pulumi.StringOutput `pulumi:"description"`
	// The status of the resource. Valid values: `0`: creating `1`: normal `2`: deleting.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewAggregator registers a new resource with the given unique name, arguments, and options.
func NewAggregator(ctx *pulumi.Context,
	name string, args *AggregatorArgs, opts ...pulumi.ResourceOption) (*Aggregator, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AggregatorName == nil {
		return nil, errors.New("invalid value for required argument 'AggregatorName'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	var resource Aggregator
	err := ctx.RegisterResource("alicloud:cfg/aggregator:Aggregator", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAggregator gets an existing Aggregator resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAggregator(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AggregatorState, opts ...pulumi.ResourceOption) (*Aggregator, error) {
	var resource Aggregator
	err := ctx.ReadResource("alicloud:cfg/aggregator:Aggregator", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Aggregator resources.
type aggregatorState struct {
	// The information of account in aggregator. If the aggregatorType is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregatorAccounts` is not required from version 1.148.0.
	AggregatorAccounts []AggregatorAggregatorAccount `pulumi:"aggregatorAccounts"`
	// The name of aggregator.
	AggregatorName *string `pulumi:"aggregatorName"`
	// The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
	AggregatorType *string `pulumi:"aggregatorType"`
	// The description of aggregator.
	Description *string `pulumi:"description"`
	// The status of the resource. Valid values: `0`: creating `1`: normal `2`: deleting.
	Status *string `pulumi:"status"`
}

type AggregatorState struct {
	// The information of account in aggregator. If the aggregatorType is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregatorAccounts` is not required from version 1.148.0.
	AggregatorAccounts AggregatorAggregatorAccountArrayInput
	// The name of aggregator.
	AggregatorName pulumi.StringPtrInput
	// The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
	AggregatorType pulumi.StringPtrInput
	// The description of aggregator.
	Description pulumi.StringPtrInput
	// The status of the resource. Valid values: `0`: creating `1`: normal `2`: deleting.
	Status pulumi.StringPtrInput
}

func (AggregatorState) ElementType() reflect.Type {
	return reflect.TypeOf((*aggregatorState)(nil)).Elem()
}

type aggregatorArgs struct {
	// The information of account in aggregator. If the aggregatorType is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregatorAccounts` is not required from version 1.148.0.
	AggregatorAccounts []AggregatorAggregatorAccount `pulumi:"aggregatorAccounts"`
	// The name of aggregator.
	AggregatorName string `pulumi:"aggregatorName"`
	// The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
	AggregatorType *string `pulumi:"aggregatorType"`
	// The description of aggregator.
	Description string `pulumi:"description"`
}

// The set of arguments for constructing a Aggregator resource.
type AggregatorArgs struct {
	// The information of account in aggregator. If the aggregatorType is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregatorAccounts` is not required from version 1.148.0.
	AggregatorAccounts AggregatorAggregatorAccountArrayInput
	// The name of aggregator.
	AggregatorName pulumi.StringInput
	// The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
	AggregatorType pulumi.StringPtrInput
	// The description of aggregator.
	Description pulumi.StringInput
}

func (AggregatorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aggregatorArgs)(nil)).Elem()
}

type AggregatorInput interface {
	pulumi.Input

	ToAggregatorOutput() AggregatorOutput
	ToAggregatorOutputWithContext(ctx context.Context) AggregatorOutput
}

func (*Aggregator) ElementType() reflect.Type {
	return reflect.TypeOf((**Aggregator)(nil)).Elem()
}

func (i *Aggregator) ToAggregatorOutput() AggregatorOutput {
	return i.ToAggregatorOutputWithContext(context.Background())
}

func (i *Aggregator) ToAggregatorOutputWithContext(ctx context.Context) AggregatorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AggregatorOutput)
}

// AggregatorArrayInput is an input type that accepts AggregatorArray and AggregatorArrayOutput values.
// You can construct a concrete instance of `AggregatorArrayInput` via:
//
//          AggregatorArray{ AggregatorArgs{...} }
type AggregatorArrayInput interface {
	pulumi.Input

	ToAggregatorArrayOutput() AggregatorArrayOutput
	ToAggregatorArrayOutputWithContext(context.Context) AggregatorArrayOutput
}

type AggregatorArray []AggregatorInput

func (AggregatorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Aggregator)(nil)).Elem()
}

func (i AggregatorArray) ToAggregatorArrayOutput() AggregatorArrayOutput {
	return i.ToAggregatorArrayOutputWithContext(context.Background())
}

func (i AggregatorArray) ToAggregatorArrayOutputWithContext(ctx context.Context) AggregatorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AggregatorArrayOutput)
}

// AggregatorMapInput is an input type that accepts AggregatorMap and AggregatorMapOutput values.
// You can construct a concrete instance of `AggregatorMapInput` via:
//
//          AggregatorMap{ "key": AggregatorArgs{...} }
type AggregatorMapInput interface {
	pulumi.Input

	ToAggregatorMapOutput() AggregatorMapOutput
	ToAggregatorMapOutputWithContext(context.Context) AggregatorMapOutput
}

type AggregatorMap map[string]AggregatorInput

func (AggregatorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Aggregator)(nil)).Elem()
}

func (i AggregatorMap) ToAggregatorMapOutput() AggregatorMapOutput {
	return i.ToAggregatorMapOutputWithContext(context.Background())
}

func (i AggregatorMap) ToAggregatorMapOutputWithContext(ctx context.Context) AggregatorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AggregatorMapOutput)
}

type AggregatorOutput struct{ *pulumi.OutputState }

func (AggregatorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Aggregator)(nil)).Elem()
}

func (o AggregatorOutput) ToAggregatorOutput() AggregatorOutput {
	return o
}

func (o AggregatorOutput) ToAggregatorOutputWithContext(ctx context.Context) AggregatorOutput {
	return o
}

type AggregatorArrayOutput struct{ *pulumi.OutputState }

func (AggregatorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Aggregator)(nil)).Elem()
}

func (o AggregatorArrayOutput) ToAggregatorArrayOutput() AggregatorArrayOutput {
	return o
}

func (o AggregatorArrayOutput) ToAggregatorArrayOutputWithContext(ctx context.Context) AggregatorArrayOutput {
	return o
}

func (o AggregatorArrayOutput) Index(i pulumi.IntInput) AggregatorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Aggregator {
		return vs[0].([]*Aggregator)[vs[1].(int)]
	}).(AggregatorOutput)
}

type AggregatorMapOutput struct{ *pulumi.OutputState }

func (AggregatorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Aggregator)(nil)).Elem()
}

func (o AggregatorMapOutput) ToAggregatorMapOutput() AggregatorMapOutput {
	return o
}

func (o AggregatorMapOutput) ToAggregatorMapOutputWithContext(ctx context.Context) AggregatorMapOutput {
	return o
}

func (o AggregatorMapOutput) MapIndex(k pulumi.StringInput) AggregatorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Aggregator {
		return vs[0].(map[string]*Aggregator)[vs[1].(string)]
	}).(AggregatorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AggregatorInput)(nil)).Elem(), &Aggregator{})
	pulumi.RegisterInputType(reflect.TypeOf((*AggregatorArrayInput)(nil)).Elem(), AggregatorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AggregatorMapInput)(nil)).Elem(), AggregatorMap{})
	pulumi.RegisterOutputType(AggregatorOutput{})
	pulumi.RegisterOutputType(AggregatorArrayOutput{})
	pulumi.RegisterOutputType(AggregatorMapOutput{})
}
