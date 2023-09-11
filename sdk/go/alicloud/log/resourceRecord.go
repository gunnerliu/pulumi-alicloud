// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package log

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Log resource is a meta store service provided by log service, resource can be used to define meta store's table structure, record can be used for table's row data.
//
// For information about SLS Resource and how to use it, see [Resource management](https://www.alibabacloud.com/help/en/doc-detail/207732.html)
//
// > **NOTE:** Available in 1.162.0+, log resource region should be set a main region: cn-heyuan
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/log"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := log.NewResourceRecord(ctx, "example", &log.ResourceRecordArgs{
//				RecordId:     pulumi.String("user_tf_test_resource_1"),
//				ResourceName: pulumi.String("user.tf.test_resource"),
//				Tag:          pulumi.String("test resource tag"),
//				Value:        pulumi.String("{\"col1\": \"this is col1 value\", \"col2\": \"col2 value\"}"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Log resource record can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:log/resourceRecord:ResourceRecord example user.tf.test_resource:user_tf_test_resource_1
//
// ```
type ResourceRecord struct {
	pulumi.CustomResourceState

	// The record's id, should be unique.
	RecordId pulumi.StringOutput `pulumi:"recordId"`
	// The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group.
	ResourceName pulumi.StringOutput `pulumi:"resourceName"`
	// The record's tag, can be used for search.
	Tag pulumi.StringOutput `pulumi:"tag"`
	// The json value of record.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewResourceRecord registers a new resource with the given unique name, arguments, and options.
func NewResourceRecord(ctx *pulumi.Context,
	name string, args *ResourceRecordArgs, opts ...pulumi.ResourceOption) (*ResourceRecord, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RecordId == nil {
		return nil, errors.New("invalid value for required argument 'RecordId'")
	}
	if args.ResourceName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceName'")
	}
	if args.Tag == nil {
		return nil, errors.New("invalid value for required argument 'Tag'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResourceRecord
	err := ctx.RegisterResource("alicloud:log/resourceRecord:ResourceRecord", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceRecord gets an existing ResourceRecord resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceRecord(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceRecordState, opts ...pulumi.ResourceOption) (*ResourceRecord, error) {
	var resource ResourceRecord
	err := ctx.ReadResource("alicloud:log/resourceRecord:ResourceRecord", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceRecord resources.
type resourceRecordState struct {
	// The record's id, should be unique.
	RecordId *string `pulumi:"recordId"`
	// The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group.
	ResourceName *string `pulumi:"resourceName"`
	// The record's tag, can be used for search.
	Tag *string `pulumi:"tag"`
	// The json value of record.
	Value *string `pulumi:"value"`
}

type ResourceRecordState struct {
	// The record's id, should be unique.
	RecordId pulumi.StringPtrInput
	// The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group.
	ResourceName pulumi.StringPtrInput
	// The record's tag, can be used for search.
	Tag pulumi.StringPtrInput
	// The json value of record.
	Value pulumi.StringPtrInput
}

func (ResourceRecordState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceRecordState)(nil)).Elem()
}

type resourceRecordArgs struct {
	// The record's id, should be unique.
	RecordId string `pulumi:"recordId"`
	// The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group.
	ResourceName string `pulumi:"resourceName"`
	// The record's tag, can be used for search.
	Tag string `pulumi:"tag"`
	// The json value of record.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a ResourceRecord resource.
type ResourceRecordArgs struct {
	// The record's id, should be unique.
	RecordId pulumi.StringInput
	// The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group.
	ResourceName pulumi.StringInput
	// The record's tag, can be used for search.
	Tag pulumi.StringInput
	// The json value of record.
	Value pulumi.StringInput
}

func (ResourceRecordArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceRecordArgs)(nil)).Elem()
}

type ResourceRecordInput interface {
	pulumi.Input

	ToResourceRecordOutput() ResourceRecordOutput
	ToResourceRecordOutputWithContext(ctx context.Context) ResourceRecordOutput
}

func (*ResourceRecord) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceRecord)(nil)).Elem()
}

func (i *ResourceRecord) ToResourceRecordOutput() ResourceRecordOutput {
	return i.ToResourceRecordOutputWithContext(context.Background())
}

func (i *ResourceRecord) ToResourceRecordOutputWithContext(ctx context.Context) ResourceRecordOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceRecordOutput)
}

func (i *ResourceRecord) ToOutput(ctx context.Context) pulumix.Output[*ResourceRecord] {
	return pulumix.Output[*ResourceRecord]{
		OutputState: i.ToResourceRecordOutputWithContext(ctx).OutputState,
	}
}

// ResourceRecordArrayInput is an input type that accepts ResourceRecordArray and ResourceRecordArrayOutput values.
// You can construct a concrete instance of `ResourceRecordArrayInput` via:
//
//	ResourceRecordArray{ ResourceRecordArgs{...} }
type ResourceRecordArrayInput interface {
	pulumi.Input

	ToResourceRecordArrayOutput() ResourceRecordArrayOutput
	ToResourceRecordArrayOutputWithContext(context.Context) ResourceRecordArrayOutput
}

type ResourceRecordArray []ResourceRecordInput

func (ResourceRecordArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceRecord)(nil)).Elem()
}

func (i ResourceRecordArray) ToResourceRecordArrayOutput() ResourceRecordArrayOutput {
	return i.ToResourceRecordArrayOutputWithContext(context.Background())
}

func (i ResourceRecordArray) ToResourceRecordArrayOutputWithContext(ctx context.Context) ResourceRecordArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceRecordArrayOutput)
}

func (i ResourceRecordArray) ToOutput(ctx context.Context) pulumix.Output[[]*ResourceRecord] {
	return pulumix.Output[[]*ResourceRecord]{
		OutputState: i.ToResourceRecordArrayOutputWithContext(ctx).OutputState,
	}
}

// ResourceRecordMapInput is an input type that accepts ResourceRecordMap and ResourceRecordMapOutput values.
// You can construct a concrete instance of `ResourceRecordMapInput` via:
//
//	ResourceRecordMap{ "key": ResourceRecordArgs{...} }
type ResourceRecordMapInput interface {
	pulumi.Input

	ToResourceRecordMapOutput() ResourceRecordMapOutput
	ToResourceRecordMapOutputWithContext(context.Context) ResourceRecordMapOutput
}

type ResourceRecordMap map[string]ResourceRecordInput

func (ResourceRecordMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceRecord)(nil)).Elem()
}

func (i ResourceRecordMap) ToResourceRecordMapOutput() ResourceRecordMapOutput {
	return i.ToResourceRecordMapOutputWithContext(context.Background())
}

func (i ResourceRecordMap) ToResourceRecordMapOutputWithContext(ctx context.Context) ResourceRecordMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceRecordMapOutput)
}

func (i ResourceRecordMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ResourceRecord] {
	return pulumix.Output[map[string]*ResourceRecord]{
		OutputState: i.ToResourceRecordMapOutputWithContext(ctx).OutputState,
	}
}

type ResourceRecordOutput struct{ *pulumi.OutputState }

func (ResourceRecordOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceRecord)(nil)).Elem()
}

func (o ResourceRecordOutput) ToResourceRecordOutput() ResourceRecordOutput {
	return o
}

func (o ResourceRecordOutput) ToResourceRecordOutputWithContext(ctx context.Context) ResourceRecordOutput {
	return o
}

func (o ResourceRecordOutput) ToOutput(ctx context.Context) pulumix.Output[*ResourceRecord] {
	return pulumix.Output[*ResourceRecord]{
		OutputState: o.OutputState,
	}
}

// The record's id, should be unique.
func (o ResourceRecordOutput) RecordId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceRecord) pulumi.StringOutput { return v.RecordId }).(pulumi.StringOutput)
}

// The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group.
func (o ResourceRecordOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceRecord) pulumi.StringOutput { return v.ResourceName }).(pulumi.StringOutput)
}

// The record's tag, can be used for search.
func (o ResourceRecordOutput) Tag() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceRecord) pulumi.StringOutput { return v.Tag }).(pulumi.StringOutput)
}

// The json value of record.
func (o ResourceRecordOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceRecord) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type ResourceRecordArrayOutput struct{ *pulumi.OutputState }

func (ResourceRecordArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceRecord)(nil)).Elem()
}

func (o ResourceRecordArrayOutput) ToResourceRecordArrayOutput() ResourceRecordArrayOutput {
	return o
}

func (o ResourceRecordArrayOutput) ToResourceRecordArrayOutputWithContext(ctx context.Context) ResourceRecordArrayOutput {
	return o
}

func (o ResourceRecordArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ResourceRecord] {
	return pulumix.Output[[]*ResourceRecord]{
		OutputState: o.OutputState,
	}
}

func (o ResourceRecordArrayOutput) Index(i pulumi.IntInput) ResourceRecordOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceRecord {
		return vs[0].([]*ResourceRecord)[vs[1].(int)]
	}).(ResourceRecordOutput)
}

type ResourceRecordMapOutput struct{ *pulumi.OutputState }

func (ResourceRecordMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceRecord)(nil)).Elem()
}

func (o ResourceRecordMapOutput) ToResourceRecordMapOutput() ResourceRecordMapOutput {
	return o
}

func (o ResourceRecordMapOutput) ToResourceRecordMapOutputWithContext(ctx context.Context) ResourceRecordMapOutput {
	return o
}

func (o ResourceRecordMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ResourceRecord] {
	return pulumix.Output[map[string]*ResourceRecord]{
		OutputState: o.OutputState,
	}
}

func (o ResourceRecordMapOutput) MapIndex(k pulumi.StringInput) ResourceRecordOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceRecord {
		return vs[0].(map[string]*ResourceRecord)[vs[1].(string)]
	}).(ResourceRecordOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceRecordInput)(nil)).Elem(), &ResourceRecord{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceRecordArrayInput)(nil)).Elem(), ResourceRecordArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceRecordMapInput)(nil)).Elem(), ResourceRecordMap{})
	pulumi.RegisterOutputType(ResourceRecordOutput{})
	pulumi.RegisterOutputType(ResourceRecordArrayOutput{})
	pulumi.RegisterOutputType(ResourceRecordMapOutput{})
}
