---
layout: doc
---
{% assign nss = site.data.api-doc.vars | group_by:"ns-name" %}
{% assign sorted-nss = nss | sort:"name" %}

{% for ns in sorted-nss %}
## {{ ns.name }}

{% assign sorted-items = ns.items | sort:"name" %}
{% for var in sorted-items %}

<h3 class="api-header" id="{{var.id}}">
{{ var.name }} <span class="small">{{ var.var-type }}</span></h3>

{: .api-header}
{% if var.arglists-str %}
Arguments:

```clojure
{{ var.arglists-str }}
```
{% endif %}
{% if var.sig-str %}
Signatures:

```
{{ var.sig-str }}
```
{% endif %}

{% if var.doc %}{{ var.doc }}{% endif %}
<a  href="{{ var.src-url }}">source</a>
{% endfor %}
{% endfor %}




