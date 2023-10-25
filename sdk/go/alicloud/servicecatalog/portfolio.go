// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Service Catalog Portfolio resource.
//
// For information about Service Catalog Portfolio and how to use it, see [What is Portfolio](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-createportfolio).
//
// > **NOTE:** Available since v1.204.0+.
//
// ## Import
//
// Service Catalog Portfolio can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:servicecatalog/portfolio:Portfolio example <id>
//
// ```
type Portfolio struct {
	pulumi.CustomResourceState

	// The creation time of the portfolio.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of the portfolio. The value must be 1 to 128 characters in length.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ARN of the portfolio.
	PortfolioArn pulumi.StringOutput `pulumi:"portfolioArn"`
	// The name of the portfolio. The value must be 1 to 128 characters in length.
	PortfolioName pulumi.StringOutput `pulumi:"portfolioName"`
	// The provider name of the portfolio. The value must be 1 to 128 characters in length.
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
}

// NewPortfolio registers a new resource with the given unique name, arguments, and options.
func NewPortfolio(ctx *pulumi.Context,
	name string, args *PortfolioArgs, opts ...pulumi.ResourceOption) (*Portfolio, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PortfolioName == nil {
		return nil, errors.New("invalid value for required argument 'PortfolioName'")
	}
	if args.ProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Portfolio
	err := ctx.RegisterResource("alicloud:servicecatalog/portfolio:Portfolio", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPortfolio gets an existing Portfolio resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPortfolio(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PortfolioState, opts ...pulumi.ResourceOption) (*Portfolio, error) {
	var resource Portfolio
	err := ctx.ReadResource("alicloud:servicecatalog/portfolio:Portfolio", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Portfolio resources.
type portfolioState struct {
	// The creation time of the portfolio.
	CreateTime *string `pulumi:"createTime"`
	// The description of the portfolio. The value must be 1 to 128 characters in length.
	Description *string `pulumi:"description"`
	// The ARN of the portfolio.
	PortfolioArn *string `pulumi:"portfolioArn"`
	// The name of the portfolio. The value must be 1 to 128 characters in length.
	PortfolioName *string `pulumi:"portfolioName"`
	// The provider name of the portfolio. The value must be 1 to 128 characters in length.
	ProviderName *string `pulumi:"providerName"`
}

type PortfolioState struct {
	// The creation time of the portfolio.
	CreateTime pulumi.StringPtrInput
	// The description of the portfolio. The value must be 1 to 128 characters in length.
	Description pulumi.StringPtrInput
	// The ARN of the portfolio.
	PortfolioArn pulumi.StringPtrInput
	// The name of the portfolio. The value must be 1 to 128 characters in length.
	PortfolioName pulumi.StringPtrInput
	// The provider name of the portfolio. The value must be 1 to 128 characters in length.
	ProviderName pulumi.StringPtrInput
}

func (PortfolioState) ElementType() reflect.Type {
	return reflect.TypeOf((*portfolioState)(nil)).Elem()
}

type portfolioArgs struct {
	// The description of the portfolio. The value must be 1 to 128 characters in length.
	Description *string `pulumi:"description"`
	// The name of the portfolio. The value must be 1 to 128 characters in length.
	PortfolioName string `pulumi:"portfolioName"`
	// The provider name of the portfolio. The value must be 1 to 128 characters in length.
	ProviderName string `pulumi:"providerName"`
}

// The set of arguments for constructing a Portfolio resource.
type PortfolioArgs struct {
	// The description of the portfolio. The value must be 1 to 128 characters in length.
	Description pulumi.StringPtrInput
	// The name of the portfolio. The value must be 1 to 128 characters in length.
	PortfolioName pulumi.StringInput
	// The provider name of the portfolio. The value must be 1 to 128 characters in length.
	ProviderName pulumi.StringInput
}

func (PortfolioArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*portfolioArgs)(nil)).Elem()
}

type PortfolioInput interface {
	pulumi.Input

	ToPortfolioOutput() PortfolioOutput
	ToPortfolioOutputWithContext(ctx context.Context) PortfolioOutput
}

func (*Portfolio) ElementType() reflect.Type {
	return reflect.TypeOf((**Portfolio)(nil)).Elem()
}

func (i *Portfolio) ToPortfolioOutput() PortfolioOutput {
	return i.ToPortfolioOutputWithContext(context.Background())
}

func (i *Portfolio) ToPortfolioOutputWithContext(ctx context.Context) PortfolioOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortfolioOutput)
}

func (i *Portfolio) ToOutput(ctx context.Context) pulumix.Output[*Portfolio] {
	return pulumix.Output[*Portfolio]{
		OutputState: i.ToPortfolioOutputWithContext(ctx).OutputState,
	}
}

// PortfolioArrayInput is an input type that accepts PortfolioArray and PortfolioArrayOutput values.
// You can construct a concrete instance of `PortfolioArrayInput` via:
//
//	PortfolioArray{ PortfolioArgs{...} }
type PortfolioArrayInput interface {
	pulumi.Input

	ToPortfolioArrayOutput() PortfolioArrayOutput
	ToPortfolioArrayOutputWithContext(context.Context) PortfolioArrayOutput
}

type PortfolioArray []PortfolioInput

func (PortfolioArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Portfolio)(nil)).Elem()
}

func (i PortfolioArray) ToPortfolioArrayOutput() PortfolioArrayOutput {
	return i.ToPortfolioArrayOutputWithContext(context.Background())
}

func (i PortfolioArray) ToPortfolioArrayOutputWithContext(ctx context.Context) PortfolioArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortfolioArrayOutput)
}

func (i PortfolioArray) ToOutput(ctx context.Context) pulumix.Output[[]*Portfolio] {
	return pulumix.Output[[]*Portfolio]{
		OutputState: i.ToPortfolioArrayOutputWithContext(ctx).OutputState,
	}
}

// PortfolioMapInput is an input type that accepts PortfolioMap and PortfolioMapOutput values.
// You can construct a concrete instance of `PortfolioMapInput` via:
//
//	PortfolioMap{ "key": PortfolioArgs{...} }
type PortfolioMapInput interface {
	pulumi.Input

	ToPortfolioMapOutput() PortfolioMapOutput
	ToPortfolioMapOutputWithContext(context.Context) PortfolioMapOutput
}

type PortfolioMap map[string]PortfolioInput

func (PortfolioMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Portfolio)(nil)).Elem()
}

func (i PortfolioMap) ToPortfolioMapOutput() PortfolioMapOutput {
	return i.ToPortfolioMapOutputWithContext(context.Background())
}

func (i PortfolioMap) ToPortfolioMapOutputWithContext(ctx context.Context) PortfolioMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortfolioMapOutput)
}

func (i PortfolioMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Portfolio] {
	return pulumix.Output[map[string]*Portfolio]{
		OutputState: i.ToPortfolioMapOutputWithContext(ctx).OutputState,
	}
}

type PortfolioOutput struct{ *pulumi.OutputState }

func (PortfolioOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Portfolio)(nil)).Elem()
}

func (o PortfolioOutput) ToPortfolioOutput() PortfolioOutput {
	return o
}

func (o PortfolioOutput) ToPortfolioOutputWithContext(ctx context.Context) PortfolioOutput {
	return o
}

func (o PortfolioOutput) ToOutput(ctx context.Context) pulumix.Output[*Portfolio] {
	return pulumix.Output[*Portfolio]{
		OutputState: o.OutputState,
	}
}

// The creation time of the portfolio.
func (o PortfolioOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Portfolio) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the portfolio. The value must be 1 to 128 characters in length.
func (o PortfolioOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Portfolio) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ARN of the portfolio.
func (o PortfolioOutput) PortfolioArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Portfolio) pulumi.StringOutput { return v.PortfolioArn }).(pulumi.StringOutput)
}

// The name of the portfolio. The value must be 1 to 128 characters in length.
func (o PortfolioOutput) PortfolioName() pulumi.StringOutput {
	return o.ApplyT(func(v *Portfolio) pulumi.StringOutput { return v.PortfolioName }).(pulumi.StringOutput)
}

// The provider name of the portfolio. The value must be 1 to 128 characters in length.
func (o PortfolioOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *Portfolio) pulumi.StringOutput { return v.ProviderName }).(pulumi.StringOutput)
}

type PortfolioArrayOutput struct{ *pulumi.OutputState }

func (PortfolioArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Portfolio)(nil)).Elem()
}

func (o PortfolioArrayOutput) ToPortfolioArrayOutput() PortfolioArrayOutput {
	return o
}

func (o PortfolioArrayOutput) ToPortfolioArrayOutputWithContext(ctx context.Context) PortfolioArrayOutput {
	return o
}

func (o PortfolioArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Portfolio] {
	return pulumix.Output[[]*Portfolio]{
		OutputState: o.OutputState,
	}
}

func (o PortfolioArrayOutput) Index(i pulumi.IntInput) PortfolioOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Portfolio {
		return vs[0].([]*Portfolio)[vs[1].(int)]
	}).(PortfolioOutput)
}

type PortfolioMapOutput struct{ *pulumi.OutputState }

func (PortfolioMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Portfolio)(nil)).Elem()
}

func (o PortfolioMapOutput) ToPortfolioMapOutput() PortfolioMapOutput {
	return o
}

func (o PortfolioMapOutput) ToPortfolioMapOutputWithContext(ctx context.Context) PortfolioMapOutput {
	return o
}

func (o PortfolioMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Portfolio] {
	return pulumix.Output[map[string]*Portfolio]{
		OutputState: o.OutputState,
	}
}

func (o PortfolioMapOutput) MapIndex(k pulumi.StringInput) PortfolioOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Portfolio {
		return vs[0].(map[string]*Portfolio)[vs[1].(string)]
	}).(PortfolioOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PortfolioInput)(nil)).Elem(), &Portfolio{})
	pulumi.RegisterInputType(reflect.TypeOf((*PortfolioArrayInput)(nil)).Elem(), PortfolioArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PortfolioMapInput)(nil)).Elem(), PortfolioMap{})
	pulumi.RegisterOutputType(PortfolioOutput{})
	pulumi.RegisterOutputType(PortfolioArrayOutput{})
	pulumi.RegisterOutputType(PortfolioMapOutput{})
}
